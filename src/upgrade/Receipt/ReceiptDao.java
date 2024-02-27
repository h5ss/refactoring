package upgrade.Receipt;

import upgrade.DBconnector;
import upgrade.UserVO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReceiptDao extends DBconnector {

    // user 객체를 받아서 userType 으로 관리자(1)와 회원(2) 구분 -> (3)은 비회원 예정
    // 입고 요청 create ->
    // 입고 요청 조회 read -> 리스트를 출력
    // 입고 요청 기간별 조회 read -> 리스트를 출력
    // 입고 요청 월별 read -> 리스트를 출력
    // 입고 요청 수정 update -> list 를 받아와서 그 객체의 정보를 수정
    // 입고 요청 취소 Cancel -> state = 1에서 0

    private Connection conn = null;

    List<ReceiptVO> receiptDaoList = new ArrayList<>();

    public void createRequestReceipt(ReceiptVO build) {
        try {
            connectDB();

            String sql = "INSERT INTO RECEIPT(rec_date, p_quantity, state, qrcode, approval, UID, PID, WID) " +
                    "VALUES(now(),? ,? ,? ,? ,? ,? ,? )";
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, build.getP_quantity());
            pstmt.setInt(2, 1);
            pstmt.setInt(3, build.getQrCode());
            pstmt.setInt(4, 0);
            pstmt.setInt(5, build.getUId());
            pstmt.setInt(6, build.getPId());
            pstmt.setInt(7, build.getWId());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }
    }
    public List<ReceiptVO> readUserReceiptList() {
        try {
            connectDB();

            ReceiptVO receiptVO;
            String sql = "SELECT * FROM RECEIPT WHERE STATE = 1 APPROVAL = 0";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                receiptVO = ReceiptVO.builder()
                        .rec_Id(rs.getInt("rec_id"))
                        .uId(rs.getInt("UID"))
                        .pId(rs.getInt("PID"))
                        .wId(rs.getInt("WID"))
                        .state(rs.getInt("state"))
                        .qrCode(rs.getInt("qrcode"))
                        .p_quantity(rs.getInt("p_quantity"))
                        .approval(rs.getInt("approval"))
                        .datetime(rs.getString("datetime"))
                        .build();

                receiptDaoList.add(receiptVO);
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }
        return receiptDaoList;
    }

    public List<ReceiptVO> readAdminReceiptList() {
        try {
            connectDB();

            String sql = "SELECT * FROM RECEIPT WHERE STATE = 1 APPROVAL = 0 ORDER BY UID";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            ReceiptVO receiptVO;

            while (rs.next()) {
                receiptVO = ReceiptVO.builder()
                        .rec_Id(rs.getInt("rec_id"))
                        .uId(rs.getInt("UID"))
                        .pId(rs.getInt("PID"))
                        .wId(rs.getInt("WID"))
                        .state(rs.getInt("state"))
                        .qrCode(rs.getInt("qrcode"))
                        .p_quantity(rs.getInt("p_quantity"))
                        .approval(rs.getInt("approval"))
                        .datetime(rs.getString("datetime"))
                        .build();

                receiptDaoList.add(receiptVO);
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }
        return receiptDaoList;
    }

    public void updateRequestReceipt(ReceiptVO build) {
        try {
            connectDB();
            String sql = "UPDATE RECEIPT SET PID = ?, P_quantity = ?, WID = ?, UID = ?," +
                    " DATETIME = ?, QRCODE = ?, STATE = ? , APPROVAL = ? " +
                    "WHERE rec_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, build.getPId());
            pstmt.setInt(2, build.getP_quantity());
            pstmt.setInt(3, build.getWId());
            pstmt.setInt(4, build.getUId());
            pstmt.setString(5, build.getDatetime());
            pstmt.setInt(6, build.getQrCode());
            pstmt.setInt(7, build.getState());
            pstmt.setInt(8, build.getApproval());
            pstmt.setInt(9, build.getRec_Id());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }

    }

    public void cancelRequestReceipt(ReceiptVO build) {
        try {
            connectDB();
            String sql = "UPDATE RECEIPT SET state = 0" +
                    "WHERE rec_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, build.getRec_Id());

            pstmt.executeUpdate();
            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeDB();
        }

    }
    public List<ReceiptVO> readUserPeriodList(UserVO userVO, String formatNewFirst,String formatNewLast){
        try{
            connectDB();

            String sql = "SELECT REC_ID, WID, PID, P_QUANTITY, DATETIME" +
                    "FROM RECEIPT" +
                    "WHERE UID = ? AND DATETIME BETWEEN ? AND ? AND STATE = 1 AND APPROVAL = 0";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,userVO.getUserID());
            pstmt.setString(2,formatNewFirst);
            pstmt.setString(3,formatNewLast);

            ResultSet rs = pstmt.executeQuery();
            ReceiptVO receiptVO;

            while (rs.next()) {
                 receiptVO = ReceiptVO.builder()
                .rec_Id(rs.getInt("Rec_ID"))
                .datetime(rs.getString("rec_date"))
                .p_quantity(rs.getInt("p_quantity"))
                .state(rs.getInt("state"))
                .qrCode(rs.getInt("qrcode"))
                .approval(rs.getInt("approval"))
                .uId(rs.getInt("UID"))
                .pId(rs.getInt("PID"))
                .wId(rs.getInt("WID"))
                        .build();

                receiptDaoList.add(receiptVO);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeDB();
        }
        return receiptDaoList;
    }
    public List<ReceiptVO> readAdminPeriodList(String formatNewFirst,String formatNewLast){
        try{
            connectDB();

            String sql = "SELECT REC_ID, WID, PID, P_QUANTITY, DATETIME" +
                    "FROM RECEIPT" +
                    "WHERE DATETIME BETWEEN ? AND ? AND STATE = 1 AND APPROVAL = 0 ";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,formatNewFirst);
            pstmt.setString(2,formatNewLast);

            ResultSet rs = pstmt.executeQuery();
            ReceiptVO receiptVO;

            while (rs.next()) {
                receiptVO = ReceiptVO.builder()
                        .rec_Id(rs.getInt("Rec_ID"))
                        .datetime(rs.getString("rec_date"))
                        .p_quantity(rs.getInt("p_quantity"))
                        .state(rs.getInt("state"))
                        .qrCode(rs.getInt("qrcode"))
                        .approval(rs.getInt("approval"))
                        .uId(rs.getInt("UID"))
                        .pId(rs.getInt("PID"))
                        .wId(rs.getInt("WID"))
                        .build();

                receiptDaoList.add(receiptVO);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeDB();
        }
        return receiptDaoList;
    }
    public List<ReceiptVO> readUserMonthList(UserVO userVO, String month){
        try{
            connectDB();

            String sql = "SELECT REC_ID, WID, PID, P_QUANTITY, DATETIME" +
                    "FROM RECEIPT" +
                    "WHERE UID = ? AND MONTH(DATETIME) = ? AND STATE = 1 AND APPROVAL = 0";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,userVO.getUserID());
            pstmt.setString(2,month);


            ResultSet rs = pstmt.executeQuery();
            ReceiptVO receiptVO;

            while (rs.next()) {
                receiptVO = ReceiptVO.builder()
                        .rec_Id(rs.getInt("Rec_ID"))
                        .datetime(rs.getString("rec_date"))
                        .p_quantity(rs.getInt("p_quantity"))
                        .state(rs.getInt("state"))
                        .qrCode(rs.getInt("qrcode"))
                        .approval(rs.getInt("approval"))
                        .uId(rs.getInt("UID"))
                        .pId(rs.getInt("PID"))
                        .wId(rs.getInt("WID"))
                        .build();

                receiptDaoList.add(receiptVO);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeDB();
        }
        return receiptDaoList;
    }
    public List<ReceiptVO> readAdminMonthList(String month){
        try{
            connectDB();

            String sql = "SELECT REC_ID, WID, PID, P_QUANTITY, DATETIME" +
                    "FROM RECEIPT" +
                    "WHERE MONTH(DATETIME) = ? AND STATE = 1 AND APPROVAL = 0 " +
                    "ORDER BY MONTH(DATETIME), UID";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,month);


            ResultSet rs = pstmt.executeQuery();
            ReceiptVO receiptVO;

            while (rs.next()) {
                receiptVO = ReceiptVO.builder()
                        .rec_Id(rs.getInt("Rec_ID"))
                        .datetime(rs.getString("rec_date"))
                        .p_quantity(rs.getInt("p_quantity"))
                        .state(rs.getInt("state"))
                        .qrCode(rs.getInt("qrcode"))
                        .approval(rs.getInt("approval"))
                        .uId(rs.getInt("UID"))
                        .pId(rs.getInt("PID"))
                        .wId(rs.getInt("WID"))
                        .build();

                receiptDaoList.add(receiptVO);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeDB();
        }
        return receiptDaoList;
    }

}
