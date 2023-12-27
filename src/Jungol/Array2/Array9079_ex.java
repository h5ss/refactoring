package Jungol.Array2;

import java.util.Scanner;

public class Array9079_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scoreArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생의 점수 ",i+1);
            for (int j = 0; j < 3; j++) {
                scoreArray[i][j] = sc.nextInt();
            }
        }
        System.out.print("    국어 영어 수학 총점\n");
        for (int i = 0; i < 3; i++) {
            int total = scoreArray[i][0]+scoreArray[i][1]+scoreArray[i][2];
            System.out.printf(" %d번 %3d %3d %3d %3d\n",i+1,scoreArray[i][0],scoreArray[i][1],scoreArray[i][2],total);
        }

        int totalKor = 0,totalEng = 0,totalMath = 0;

        for (int i = 0; i < 3; i++) {
            totalKor += scoreArray[i][0];
            totalEng += scoreArray[i][1];
            totalMath += scoreArray[i][2];
        }
        int totalTotal = totalKor + totalEng + totalMath;
        System.out.printf("합계 %d %d %d %d",totalKor, totalEng, totalMath, totalTotal);
    }
}
