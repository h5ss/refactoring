package Loop1;

import java.util.Scanner;

public class Loop538_self3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("number? ");
            int num = sc.nextInt();
            if (num > 0)
                System.out.println("positive integer");
            else if (num < 0)
                System.out.println("negative number");
            else if (num == 0)
                break;
        }
    }
}
