package OOP.advanced.collection.Board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    private Scanner sc = new Scanner(System.in);
    private List<Board> boards = new ArrayList<Board>();


    // method

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-----------------------------------------------------------------");
        for (Board row : boards)
            System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBdate(), row.getBtitle());
        mainMenu();
    }

    public void mainMenu() {

        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("메인 메뉴 : 1.Create | 2. Read | 3. Clear | 4.Exit");
        System.out.print("메뉴 선택 : ");
        String menuNum = sc.nextLine();
        System.out.println();

        switch (menuNum) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    private void exit() {
        System.out.println("***exit()메소드 실행됨 프로그램이 종료됩니다.");
        System.exit(0);
    }

    private void clear() {
        System.out.println("***clear()메소드 실행됨");
        System.out.println("[게시물 전체 삭제]");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("보조 메뉴 : 1. Ok | 2.Cancel");
        System.out.print("메뉴 선택 : ");
        String selectNum = sc.nextLine();
        if (selectNum.equals("1")) {
            boards.removeAll(boards);
            list();
        }
    }

    private void read() {
        System.out.println("***read()메소드 실행됨");
        System.out.println("전체 게시물 출력");
        System.out.println("[게시물 목록]");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-----------------------------------------------------------------");
        for (Board row : boards)
            System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBdate(), row.getBtitle());
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[게시물 읽기]");
        System.out.print("bno : ");
        int bno = Integer.parseInt(sc.nextLine());
        readOne(bno);
        list();
        /*for (Board row : boards){
            System.out.printf("%-6s%-12s%-16s%-40s\n",row.getBno(),row.getBwriter(),row.getBdate(),row.getBtitle());
        }*/
    }

    private void readOne(int bno) {
        for (Board row : boards) {
            if (row.getBno() == bno) {
                System.out.println("###############");
                System.out.printf("번호 : %s\n", bno);
                System.out.printf("제목 : %s\n", row.getBtitle());
                System.out.printf("내용 : %s\n", row.getBcontent());
                System.out.printf("작성자 : %s\n", row.getBwriter());
                System.out.printf("날짜 : %s\n", getCurrentDate());
                System.out.println("###############");
            }
        }
        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴선택 : ");
        String selectNum = sc.nextLine();
        System.out.println();

        switch (selectNum) {
            case "1" -> update(bno);
            case "2" -> delete(bno);
            case "3" -> list();
        }
    }

    private void delete(int bno) {
        for (Board board : boards) {
            if (board.getBno() == bno) {
                boards.remove(board);
                list();
            }
        }
    }

    private void update(int bno) {
        try{
            for (Board board : boards) {
                if (board.getBno() == bno) {
                    System.out.println("제목 : ");
                    board.setBtitle(sc.nextLine());
                    System.out.println("내용 : ");
                    board.setBcontent(sc.nextLine());
                    System.out.println("작성자 : ");
                    board.setBwriter(sc.nextLine());
                    System.out.println("-----------------------------------------------------------------\n");
                    System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
                    System.out.print("메뉴선택 : ");
                    String selectNum = sc.nextLine();
                    if (selectNum.equals("1"))
                        list();
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            exit();
        }
        list();
    }

    private void create() {
        System.out.println("***create()메소드 실행됨");
        // 입력받은 게시물의 제목, 내용, 작성자를 Board 객체에 저장하여 게시글 하나를 생성한다.
        try {
            Board row = new Board();
            System.out.println("[새 게시물 입력]");
            row.setBno(boards.size() + 1);
            System.out.print("제목 : ");
            row.setBtitle(sc.nextLine());
            System.out.print("내용 : ");
            row.setBcontent(sc.nextLine());
            System.out.print("작성자 : ");
            row.setBwriter(sc.nextLine());
            row.setBdate(getCurrentDate());

            System.out.println("-----------------------------------------------------------------");
            System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
            System.out.print("메뉴 선택 : ");
            String menuNo = sc.nextLine();
            if (menuNo.equals("1")) {
                boards.add(row);
                System.out.println("게시물 추가 완료!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            exit();
        }
        list();
    }


    public String getCurrentDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = date.format(new Date());
        return currentDate;
    }
}
