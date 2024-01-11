package OOP.advanced.collection.BoardTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
    List<Board> boards = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void list(){
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-6s%-8s%-12s%-16s\n","no","writer","date","title");
        System.out.println("---------------------------------------------------------------");
        for (Board board : boards)
            System.out.printf("%-6s%-8s%-12s%-16s",board.getBno(),board.getBwriter(),board.getBdate(),board.getBtitle());
        mainMenu();
    }
    public void mainMenu(){
        System.out.println("---------------------------------------------------------------");
        System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택 :");
        String selectNum = sc.nextLine();
        switch (selectNum){
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    private void exit() {
        System.out.println("종료합니다.");
        System.exit(0);
    }

    private void clear() {
    }

    private void read() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-6s%-8s%-12s%-16s\n","no","writer","date","title");
        System.out.println("---------------------------------------------------------------");
        for (Board board : boards)
            System.out.printf("%-6s%-8s%-12s%-16s\n",board.getBno(),board.getBwriter(),board.getBdate(),board.getBtitle());
        System.out.println("---------------------------------------------------------------");

        System.out.println("\n[게시물 읽기]");
        System.out.print("bno : ");
        String bno = sc.nextLine();

        readOne(bno);
        list();
    }
    private void readOne(String bno){
        for (Board board : boards){
            if (board.getBno() == Integer.parseInt(bno)){
                System.out.println("##############");
                System.out.printf("제목 : %s\n",board.getBtitle());
                System.out.printf("내용 : %s\n",board.getBcontent());
                System.out.printf("작성자 : %s\n",board.getBwriter());
                System.out.printf("날짜 : %s\n",board.getBdate());
                System.out.println("##############");
            }
        }
        System.out.println("보조메뉴 : 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴선택 : ");
        String selectNum = sc.nextLine();
        switch (selectNum){
            case "1" -> update(bno);
            case "2" -> delete(bno);
            case "3" -> list();
        }
    }

    private void delete(String bno) {
        for (Board board : boards)
            if (board.getBno() == Integer.parseInt(bno)){
                boards.remove(board);
                System.out.println("삭제되었습니다.");
                list();
            }

    }

    private void update(String bno) {
        try{
            for (Board board : boards){
                if (board.getBno() == Integer.parseInt(bno)){
                    System.out.println("제목 : ");
                    board.setBtitle(sc.nextLine());
                    System.out.println("내용 : ");
                    board.setBcontent(sc.nextLine());
                    System.out.println("작성자 : ");
                    board.setBwriter(sc.nextLine());
                    System.out.println("-----------------------------------------------------------------\n");
                    System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
                    System.out.print("메뉴 선택 : ");
                    String menuNUm = sc.nextLine();
                    if (menuNUm.equals("1"))
                        list();
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            exit();
        }
    }

    private void create() {
        try{
            Board board = new Board();
            System.out.println("\n[새 게시물 입력]");
            board.setBno(boards.size()+1);
            System.out.print("제목 : ");
            board.setBtitle(sc.nextLine());
            System.out.print("내용 : ");
            board.setBcontent(sc.nextLine());
            System.out.print("작성자 : ");
            board.setBwriter(sc.nextLine());
            board.setBdate(getCurrentDate());

            System.out.println("---------------------------------------------------------------");
            System.out.println("보조 메뉴 : 1.Ok | Cancel");
            System.out.print("메뉴 선택 : ");
            String menuNum = sc.nextLine();
            if (menuNum.equals("1")){
                boards.add(board);
                System.out.println("[게시물 추가 완료!]");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            exit();
        }
        list();
    }
    public String getCurrentDate(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = date.format(new Date());
        return currentDate;
    }
}
