package Loop2;

import java.util.Scanner;

public class Loop546_self6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int sbjNum = sc.nextInt();
            if (sbjNum > 10) {
                System.out.print("과목 수가 너무 많습니다\n다시 입력해주세요.");
                continue;
            } else {
                int total = 0;
                int count = 0;
                for (int i = 0; i < sbjNum; i++) {
                    int sbjScore = sc.nextInt();
                    total += sbjScore;
                    count++;
                }
                double avg = (double) total / count;
                if (avg >= 80) {
                    System.out.printf("avg : %.1f\npass", avg);
                    break;
                } else {
                    System.out.printf("avg : %.1f\nfail", avg);
                    break;
                }


            }
        }
    }
}
