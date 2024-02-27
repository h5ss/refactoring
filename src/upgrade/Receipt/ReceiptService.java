package upgrade.Receipt;

import upgrade.IReceiptService;
import upgrade.ReceiptException.ReceiptExceptionList;
import upgrade.UserVO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class ReceiptService implements IReceiptService {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ReceiptDao receiptDao = new ReceiptDao();
    List<ReceiptVO> receiptServiceList = new ArrayList<>();

    @Override
    public void receiptMenu(UserVO userVO) {
        try {
            printReceiptMenu(userVO);
            System.out.print("선택해주세요 : ");
            String choice = input.readLine();
            ReceiptExceptionList.validateMenuChoice(choice);
            if (userVO.getUserType() == 1) {
                switch (choice) {
                    case "1" -> receiptAdminApproval(userVO);
                    case "2" -> updateAdminReceipt(userVO);
                    case "3" -> cancelAdminReceipt(userVO);
                    case "4" -> choiceReceiptAdmin(userVO);
//                case "5" -> 뒤로 가기
                }
            } else if (userVO.getUserType() == 2) {
                switch (choice) {
                    case "1" -> requestUserReceipt(userVO);
                    case "2" -> updateUserReceipt(userVO);
                    case "3" -> cancelUserReceipt(userVO);
                    case "4" -> choiceUserReceipt(userVO);
//                case "5" -> 뒤로 가기
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    // -----------------------------------관리자일 때-------------------------------
    private void receiptAdminApproval(UserVO userVO) {
        try{
            receiptServiceList = receiptDao.readAdminReceiptList();
            System.out.println("+=======================+");
            System.out.println("|  관리자 입고 요청 승인 화면 |");
            System.out.println("+=======================+");

            printSearchReceipt(userVO);     // 리스트 출력

            System.out.print("승인할 입고 ID를 입력하세요. q!를 입력하면 종료합니다. : ");
            while (true) {
                String id = input.readLine();
                ReceiptExceptionList.validateId(id);

                if (id.equals("q!")) {
                    System.out.println("입력 종료되었습니다.");
                    break;
                }

                for (ReceiptVO receiptVO : receiptServiceList) {
                    if (receiptVO.getRec_Id() == Integer.parseInt(id)) {

                        ReceiptVO build = ReceiptVO.builder()
                                .rec_Id(receiptVO.getRec_Id())
                                .uId(receiptVO.getUId())
                                .pId(receiptVO.getPId())
                                .p_quantity(receiptVO.getP_quantity())
                                .wId(receiptVO.getWId())
                                .datetime(receiptVO.getDatetime())
                                .qrCode(receiptVO.getQrCode())
                                .state(receiptVO.getState())
                                .approval(1)
                                .build();
                        receiptDao.updateRequestReceipt(build);
                    }
                }
            }
            System.out.println("승인되었습니다.");
            receiptMenu(userVO);
        }catch (Exception e){

        }

    }

    // --> qr 코드 생성, approval 값도 1이 되야함
    private void updateAdminReceipt(UserVO userVO) throws Exception {
        receiptServiceList = receiptDao.readAdminReceiptList();
        System.out.println("+=======================+");
        System.out.println("|    관리자 입고 수정 화면   |");
        System.out.println("+=======================+");

        printAdminReceipt(userVO);

        System.out.print("수정할 입고 ID를 입력하세요. : ");
        String id = input.readLine();
        ReceiptExceptionList.validateId(id);

        System.out.print("상품 ID를 입력하세요 [ ex) 104 ]  : ");
        String productId = input.readLine();
        ReceiptExceptionList.validateId(productId);

        System.out.print("상품 수량을 입력하세요 : ");
        String productQuantity = input.readLine();
        ReceiptExceptionList.validateId(productQuantity);

        System.out.print("창고 ID를 입력하세요 : ");
        String warehouseId = input.readLine();
        ReceiptExceptionList.validateId(warehouseId);

        ReceiptVO build = ReceiptVO.builder()
                .rec_Id(Integer.parseInt(id))
                .pId(Integer.parseInt(productId))
                .p_quantity(Integer.parseInt(productQuantity))
                .wId(Integer.parseInt(warehouseId))
                .build();

        receiptDao.updateRequestReceipt(build);

        System.out.println("수정 완료되었습니다.");
        receiptMenu(userVO);
    }

    private void cancelAdminReceipt(UserVO userVO) throws Exception {
        receiptServiceList = receiptDao.readAdminReceiptList();
        System.out.println("+=======================+");
        System.out.println("|    관리자 입고 취소 화면   |");
        System.out.println("+=======================+");

        printAdminReceipt(userVO);

        System.out.print("수정할 입고 ID를 입력하세요. : ");
        String id = input.readLine();
        ReceiptExceptionList.validateId(id);

        for (ReceiptVO receiptVO : receiptServiceList) {
            if (receiptVO.getRec_Id() == Integer.parseInt(id)) {

                ReceiptVO build = ReceiptVO.builder()
                        .rec_Id(receiptVO.getRec_Id())
                        .uId(receiptVO.getUId())
                        .pId(receiptVO.getPId())
                        .p_quantity(receiptVO.getP_quantity())
                        .wId(receiptVO.getWId())
                        .approval(receiptVO.getApproval())
                        .datetime(receiptVO.getDatetime())
                        .qrCode(receiptVO.getQrCode())
                        .state(0)
                        .build();

                receiptDao.cancelRequestReceipt(build);
            }
        }
        System.out.println("취소 되었습니다.");
        receiptMenu(userVO);
    }

    private void choiceReceiptAdmin(UserVO userVO) throws Exception {
        printChoiceReceipt(userVO);
        System.out.print("선택해주세요 : ");
        String choice = input.readLine();
        ReceiptExceptionList.validateChoice(choice);

        switch (choice) {
            case "1" -> searchAdminReceipt(userVO);
            case "2" -> searchPeriodAdminReceipt(userVO);
            case "3" -> searchMonthAdminReceipt(userVO);
//            case "4" -> 돌아가기
        }
    }

    private void searchAdminReceipt(UserVO userVO) throws Exception {
        receiptServiceList = receiptDao.readAdminReceiptList();

        System.out.println("+========================+");
        System.out.println("| 관리자의 입고 요청 현황 조회 입니다.");
        System.out.println("+========================+");

        for (ReceiptVO receiptVO : receiptServiceList) {
            System.out.println("입고 ID    창고 ID    상품 ID    상품 수량    날짜");
            System.out.println("---------------------------------------");
            System.out.printf("%-4d", receiptVO.getRec_Id());
            System.out.printf("%-4d", receiptVO.getWId());
            System.out.printf("%-4d", receiptVO.getPId());
            System.out.printf("%-4d", receiptVO.getP_quantity());
            System.out.printf("%-4s", receiptVO.getDatetime());
        }
        choiceReceiptAdmin(userVO);
    }

    private void searchPeriodAdminReceipt(UserVO userVO) throws Exception {
        System.out.println("+=======================+");
        System.out.println("| 기간 별 조회 현황입니다");
        System.out.println("+=======================+");
        System.out.println("조회할 기간을 입력해주세요.[입력 ex) 20001004] \n");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("시작 날짜를 입력하세요 : ");
        String firstDate = input.readLine();
        ReceiptExceptionList.validateDate(firstDate);

        Date formatDateFirst = simpleDateFormat.parse(firstDate);
        String formatNewFirst = newDtFormat.format(formatDateFirst);

        System.out.print("끝 날짜를 입력하세요 : ");
        String lastDate = input.readLine();
        ReceiptExceptionList.validateDate(lastDate);

        Date formatDateLast = simpleDateFormat.parse(lastDate);
        String formatNewLast = newDtFormat.format(formatDateLast);

        System.out.println(formatNewFirst + " ~ " + formatNewLast + " 기간의 입고 현황입니다.\n");
        System.out.println("==========================================");
        receiptServiceList = receiptDao.readAdminPeriodList(formatNewFirst, formatNewLast);

        for (ReceiptVO receiptVO : receiptServiceList) {
            System.out.println("입고 ID    창고 ID    상품 ID    상품 수량    날짜");
            System.out.println("---------------------------------------");
            System.out.printf("%-4d", receiptVO.getRec_Id());
            System.out.printf("%-4d", receiptVO.getWId());
            System.out.printf("%-4d", receiptVO.getPId());
            System.out.printf("%-4d", receiptVO.getP_quantity());
            System.out.printf("%-4s", receiptVO.getDatetime());
        }
        choiceReceiptAdmin(userVO);
    }

    private void searchMonthAdminReceipt(UserVO userVO) throws Exception {
        System.out.println("+=======================+");
        System.out.println("| 월 별 조회 현황입니다");
        System.out.println("+=======================+\n");

        System.out.print("조회할 월을 입력해주세요. : ");
        String month = input.readLine();
        ReceiptExceptionList.validateMonth(month);

        System.out.printf("%s 월의 입고 요청 현황입니다.", month);
        System.out.println("=============================");
        receiptServiceList = receiptDao.readAdminMonthList(month);

        for (ReceiptVO receiptVO : receiptServiceList) {
            System.out.println("입고 ID    창고 ID    상품 ID    상품 수량    날짜");
            System.out.println("---------------------------------------");
            System.out.printf("%-4d", receiptVO.getRec_Id());
            System.out.printf("%-4d", receiptVO.getWId());
            System.out.printf("%-4d", receiptVO.getPId());
            System.out.printf("%-4d", receiptVO.getP_quantity());
            System.out.printf("%-4s", receiptVO.getDatetime());
        }
        choiceReceiptAdmin(userVO);
    }

    // -----------------------------------회원일 때-------------------------------
    // 입고 요청할 때 qr 코드도 생성 되게끔 -> 근데 입고요청 화면에 입력한 정보를 바탕으로 qr 코드 생성해야함(2차 준비)
    private void requestUserReceipt(UserVO userVO) throws Exception {
        System.out.println("+========================+");
        System.out.printf("| %s 회원의 입고 요청 화면입니다.\n", userVO.getUserName());
        System.out.println("+========================+");
        System.out.println("입고 요청할 상품의 정보를 입력하세요.");

        System.out.print("상품 ID를 입력하세요 [ ex) 104 ]  : ");
        String productId = input.readLine();
        ReceiptExceptionList.validateId(productId);

        System.out.print("상품 수량을 입력하세요 : ");
        String productQuantity = input.readLine();
        ReceiptExceptionList.validateId(productQuantity);

        System.out.print("창고 ID를 입력하세요 : ");
        String warehouseId = input.readLine();
        ReceiptExceptionList.validateId(warehouseId);

        // null 값을
        // optional 로 감싸서 던지고
        // 여기와서 NULL 이면 예외로 던진다
        // optional 검색 ! + 활용( 예외 처리 시 사용)

        ReceiptVO build = ReceiptVO.builder()
                .uId(userVO.getUserID())
                .pId(Integer.parseInt(productId))
                .p_quantity(Integer.parseInt(productQuantity))
                .wId(Integer.parseInt(warehouseId))
//                .qrCode()             -> 입고 요청 시에 qr 코드 만들어지게
                .build();

        receiptDao.createRequestReceipt(build);
        System.out.println("입고 요청이 입력되었습니다.");
        receiptMenu(userVO);
    }

    private void updateUserReceipt(UserVO userVO) throws Exception {
        receiptServiceList = receiptDao.readUserReceiptList();

        System.out.println("+=======================+");
        System.out.printf("| %s 회원의 입고 요청 수정 화면입니다.\n", userVO.getUserName());
        System.out.println("+=======================+\n");
        printSearchReceipt(userVO);     // 현재 리스트 출력

        System.out.print("수정할 건의 입고 ID를 입력하세요 : ");
        String id = input.readLine();
        ReceiptExceptionList.validateId(id);
        // 예외 처리 -> 입력 값이 리스트에 없을 경우,


        System.out.print("상품 ID를 입력하세요 : ");
        String pId = input.readLine();
        ReceiptExceptionList.validateId(pId);

        System.out.print("상품 수량을 입력하세요 : ");
        String productQuantity = input.readLine();
        ReceiptExceptionList.validateId(productQuantity);

        System.out.print("사용할 창고 ID 입력하세요 : ");
        String wId = input.readLine();
        ReceiptExceptionList.validateId(wId);

        ReceiptVO build = ReceiptVO.builder()
                .rec_Id(Integer.parseInt(id))
                .pId(Integer.parseInt(pId))
                .p_quantity(Integer.parseInt(productQuantity))
                .wId(Integer.parseInt(wId))
                .build();

        receiptDao.updateRequestReceipt(build);

        System.out.println("수정 되었습니다.");
        receiptMenu(userVO);
    }


    private void cancelUserReceipt(UserVO userVO) throws Exception {
        receiptServiceList = receiptDao.readUserReceiptList();

        System.out.println("+=======================+");
        System.out.printf("| %s 회원의 입고 요청 취소 화면입니다.\n", userVO.getUserName());
        System.out.println("+=======================+\n");
        printSearchReceipt(userVO);     // 현재 리스트 출력

        System.out.print("취소할 건의 입고 ID를 입력하세요 : ");     // 상태(state)를 0으로 셋
        String id = input.readLine();
        ReceiptExceptionList.validateId(id);
        // 예외 처리 -> 입력 값이 리스트에 없을 경우,

        for (ReceiptVO receiptVO : receiptServiceList) {
            if (receiptVO.getRec_Id() == Integer.parseInt(id)) {

                ReceiptVO build = ReceiptVO.builder()
                        .rec_Id(receiptVO.getRec_Id())
                        .uId(receiptVO.getUId())
                        .pId(receiptVO.getPId())
                        .p_quantity(receiptVO.getP_quantity())
                        .wId(receiptVO.getWId())
                        .approval(receiptVO.getApproval())
                        .datetime(receiptVO.getDatetime())
                        .qrCode(receiptVO.getQrCode())
                        .state(0)
                        .build();

                receiptDao.cancelRequestReceipt(build);
            }
        }
        System.out.println("취소 되었습니다.");
        receiptMenu(userVO);
    }

    private void choiceUserReceipt(UserVO uservo) throws Exception {
        printChoiceReceipt(uservo);
        System.out.print("선택해주세요 : ");
        String choice = input.readLine();
        ReceiptExceptionList.validateMenuChoice(choice);

        switch (choice) {
            case "1" -> searchUserReceipt(uservo);
            case "2" -> searchPeriodUserReceipt(uservo);
            case "3" -> searchMonthUserReceipt(uservo);
            case "4" -> searchQRCodeUserReceipt(uservo);
//            case "5" -> 돌아가기
        }
    }

    private void searchUserReceipt(UserVO userVO) throws Exception {
        receiptServiceList = receiptDao.readUserReceiptList();

        System.out.println("+========================+");
        System.out.printf("| %s 회원의 입고 요청 현황 조회 입니다.", userVO.getUserName());
        System.out.println("+========================+");

        for (ReceiptVO receiptVO : receiptServiceList) {
            if (receiptVO.getUId() == userVO.getUserID()) {
                System.out.println("입고 ID    창고 ID    상품 ID    상품 수량    날짜");
                System.out.println("---------------------------------------");
                System.out.printf("%-4d", receiptVO.getRec_Id());
                System.out.printf("%-4d", receiptVO.getWId());
                System.out.printf("%-4d", receiptVO.getPId());
                System.out.printf("%-4d", receiptVO.getP_quantity());
                System.out.printf("%-4s", receiptVO.getDatetime());
            }
        }
        choiceUserReceipt(userVO);
    }

    private void searchPeriodUserReceipt(UserVO userVO) throws Exception {
        System.out.println("+=======================+");
        System.out.println("| 기간 별 조회 현황입니다");
        System.out.println("+=======================+");
        System.out.println("조회할 기간을 입력해주세요.[입력 ex) 20001004] \n");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("시작 날짜를 입력하세요 : ");
        String firstDate = input.readLine();
        ReceiptExceptionList.validateDate(firstDate);

        Date formatDateFirst = simpleDateFormat.parse(firstDate);
        String formatNewFirst = newDtFormat.format(formatDateFirst);

        System.out.print("끝 날짜를 입력하세요 : ");
        String lastDate = input.readLine();
        ReceiptExceptionList.validateId(lastDate);

        Date formatDateLast = simpleDateFormat.parse(lastDate);
        String formatNewLast = newDtFormat.format(formatDateLast);

        System.out.println(formatNewFirst + " ~ " + formatNewLast + " 기간의 입고 현황입니다.\n");
        System.out.println("==========================================");
        receiptServiceList = receiptDao.readUserPeriodList(userVO, formatNewFirst, formatNewLast);

        for (ReceiptVO receiptVO : receiptServiceList) {
            System.out.println("입고 ID    창고 ID    상품 ID    상품 수량    날짜");
            System.out.println("---------------------------------------");
            System.out.printf("%-4d", receiptVO.getRec_Id());
            System.out.printf("%-4d", receiptVO.getWId());
            System.out.printf("%-4d", receiptVO.getPId());
            System.out.printf("%-4d", receiptVO.getP_quantity());
            System.out.printf("%-4s", receiptVO.getDatetime());
        }
        choiceUserReceipt(userVO);
    }

    private void searchMonthUserReceipt(UserVO userVO) throws Exception {
        System.out.println("+=======================+");
        System.out.println("| 월 별 조회 현황입니다");
        System.out.println("+=======================+\n");

        System.out.print("조회할 월을 입력해주세요. : ");
        String month = input.readLine();
        ReceiptExceptionList.validateMonth(month);

        System.out.printf("%s 월의 입고 요청 현황입니다.", month);
        System.out.println("=============================");
        receiptServiceList = receiptDao.readUserMonthList(userVO, month);

        for (ReceiptVO receiptVO : receiptServiceList) {
            System.out.println("입고 ID    창고 ID    상품 ID    상품 수량    날짜");
            System.out.println("---------------------------------------");
            System.out.printf("%-4d", receiptVO.getRec_Id());
            System.out.printf("%-4d", receiptVO.getWId());
            System.out.printf("%-4d", receiptVO.getPId());
            System.out.printf("%-4d", receiptVO.getP_quantity());
            System.out.printf("%-4s", receiptVO.getDatetime());
        }
        choiceUserReceipt(userVO);
    }

    private void searchQRCodeUserReceipt(UserVO userVO) {
    }


    private void printReceiptMenu(UserVO userVO) {      // 관리자, 회원 메뉴 선택 화면 출력
        if (userVO.getUserType() == 1) {

            System.out.println("+=======================+");
            System.out.println("|   관리자 전용 메뉴입니다.  ");
            System.out.println("|=======================");
            System.out.println("| 1. 입고 요청 승인        ");
            System.out.println("| 2. 입고 요청 수정        ");
            System.out.println("| 3. 입고 요청 취소        ");
            System.out.println("| 4. 입고 정보 조회        ");
            System.out.println("| 5. 돌아가기    ");
            System.out.println("+=======================+");

        } else if (userVO.getUserType() == 2) {

            System.out.println("+=======================+");
            System.out.println("|   회원 전용 메뉴입니다.    ");
            System.out.println("|=======================");
            System.out.println("| 1. 입고 요청            ");
            System.out.println("| 2. 입고 요청 수정        ");
            System.out.println("| 3. 입고 요청 취소        ");
            System.out.println("| 4. 입고 정보 조회        ");
            System.out.println("| 5. 돌아가기    ");
            System.out.println("+=======================+");
        }
    }

    private void printChoiceReceipt(UserVO userVO) {        // 관리자, 회원 조회 선택 화면 출력
        if (userVO.getUserType() == 1) {

            System.out.println("+=======================+");
            System.out.println("|  관리자 전용 조회 화면입니다.  ");
            System.out.println("|=======================");
            System.out.println("| 1. 입고 현황 조회        ");
            System.out.println("| 2. 기간별 입고 현황 조회   ");
            System.out.println("| 3. 월별 입고 현황 조회    ");
            System.out.println("| 4. 돌아가기    ");
            System.out.println("+=======================+");

        } else if (userVO.getUserType() == 2) {

            System.out.println("+=======================+");
            System.out.println("|  회원 전용 조회 화면입니다.  ");
            System.out.println("|=======================");
            System.out.println("| 1. 입고 요청 현황 조회    ");
            System.out.println("| 2. 기간별 입고 현황 조회   ");
            System.out.println("| 3. 월별 입고 현황 조회    ");
            System.out.println("| 4. QR 코드 조회        ");
            System.out.println("| 5. 돌아가기    ");
            System.out.println("+=======================+");
        }
    }

    private void printSearchReceipt(UserVO userVO) {
        receiptServiceList = receiptDao.readUserReceiptList();
        for (ReceiptVO receiptVO : receiptServiceList) {
            if (userVO.getUserID() == receiptVO.getUId()) {
                System.out.printf("입고 ID : %-8d | ", receiptVO.getRec_Id());
                System.out.printf("회원 번호 : %-6d | ", receiptVO.getUId());
                System.out.printf("상품 ID : %-5d | ", receiptVO.getPId());
                System.out.printf("상품 수량 : %-4d | ", receiptVO.getP_quantity());
                System.out.printf("날짜 시간 : %s\n", receiptVO.getDatetime());
            }
        }
        System.out.println("===================================================");
    }

    private void printAdminReceipt(UserVO userVO) {         // 현재 userVO.userId와 receiptVO.UID 비교
        receiptServiceList = receiptDao.readAdminReceiptList();    // -> 같으면 담겨 있는 리스트 출력
        for (ReceiptVO receiptVO : receiptServiceList) {
            if (userVO.getUserID() == receiptVO.getUId() && receiptVO.getState() == 1) {
                System.out.printf("입고 ID : %-8d | ", receiptVO.getRec_Id());
                System.out.printf("회원 번호 : %-6d | ", receiptVO.getUId());
                System.out.printf("상품 ID : %-5d | ", receiptVO.getPId());
                System.out.printf("상품 수량 : %-4d | ", receiptVO.getP_quantity());
                System.out.printf("날짜 시간 : %s\n", receiptVO.getDatetime());
            }
        }
        System.out.println("===================================================");
    }
}
