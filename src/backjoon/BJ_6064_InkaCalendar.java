package backjoon;

import java.util.Scanner;

public class BJ_6064_InkaCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            boolean check = false;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            for (int j = x; j < (n*m); j+=m) {
                if (j % n == y){
                    System.out.println(m+1);
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println(-1);
        }
    }
}
