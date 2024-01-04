package OOP.advanced.collection.BoardTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    Scanner sc = new Scanner(System.in);
    List<Board> boards = new ArrayList<>();
    public void list(){
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-------------------------------------------------------------------------------");

        mainMenu();
    }
    public void mainMenu(){
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("메인 메뉴 : 1.Create | 2. Read | 3.Clear | 4.Exit");
        System.out.println("메뉴 선택 : ");
        String selectNum = sc.nextLine();
        switch (selectNum){
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    private void exit() {
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
    }

    private void clear() {

    }

    private void read() {
        System.out.println("***read 메소드 실행됨");
        System.out.println();
        System.out.println("[게시물 읽기]");
        System.out.print("bno : ");
        String selectBno = sc.nextLine();
        System.out.println("############");
        System.out.printf("번호 : %s\n","q");
    }

    private void create() {
        System.out.println("***create 메소드 실행됨***");
        try {
            Board row = new Board();
            System.out.println();
            System.out.println("[새 게시물 입력]");
            row.setBno(boards.size()+1);
            System.out.print("제목 : ");
            row.setBtitle(sc.nextLine());
            System.out.print("내용 : ");
            row.setBcontent(sc.nextLine());
            System.out.print("작성자 : ");
            row.setBwriter(sc.nextLine());
            row.setBdate(getCurrentDate());
            System.out.println("-------------------------------------------------------------------------------");

            System.out.println("보조 메뉴 : 1.Ok | Cancel");
            System.out.println("메뉴 선택 : ");
            String menuNum = sc.nextLine();
            if (menuNum.equals("1")){
                boards.add(row);
                System.out.println("게시물 작성 완료");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            exit();
        }
    }
    public String getCurrentDate() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = date.format(new Date());
        return currentDate;
    }
}
