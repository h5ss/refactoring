package Loop1;

import java.util.Scanner;

class Run {
    static Scanner sc = new Scanner(System.in);
    int selectNum;

    public void Run() {
        while (true) {
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            int selectNum = sc.nextInt();
            switch (selectNum) {
                case 1:
                    System.out.println("\n입력하기를 선택하였습니다.\n");
                    break;
                case 2:
                    System.out.println("\n출력하기를 선택하였습니다.\n");
                    break;
                case 3:
                    System.out.println("\n삭제하기를 선택하였습니다.\n");
                    break;
                case 4:
                    System.out.println("\n끝내기를 선택하였습니다.\n");
                    System.exit(0);
                default:
                    System.out.println("\n잘못 입력하였습니다. \n");
            }
        }
    }

}

public class Loop9045_ex {

    public static void main(String[] args) {
        Run r = new Run();
        r.Run();
    }
}
