package Loop1;

import java.util.Scanner;

class NationRun {
    static Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");
            int selectNum = sc.nextInt();
            switch (selectNum) {
                case 1:
                    System.out.println("\nSeoul\n");
                    break;
                case 2:
                    System.out.println("\nWashington\n");
                    break;
                case 3:
                    System.out.println("\nTokyo\n");
                    break;
                case 4:
                    System.out.println("\nBeijing\n");
                    break;
                default:
                    System.out.println("\nnone\n");
                    System.exit(0);
            }
        }
    }

}

public class Loop633_self6 {

    public static void main(String[] args) {
        NationRun run = new NationRun();
        run.run();
    }
}
