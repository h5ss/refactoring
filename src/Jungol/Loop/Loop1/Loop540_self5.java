package Loop1;

import java.util.Scanner;

public class Loop540_self5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            int num = sc.nextInt();
            if (num % 3 == 0) {
                int portion = num / 3;
                System.out.println(portion);
            } else if (num == -1) {
                break;
            }

        }
    }
}
