package Loop1;

import java.util.Scanner;

public class Loop537_self2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        int total = 0;
        while (num != 0) {
            total += num;
            num--;
        }
        System.out.println(total);
    }
}
