package Jungol.Array2;

import java.util.Scanner;

public class Array9078_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] intArray1 = new int[3][3];
        int[][] intArray2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("첫 번째 배열 %d행 ",i+1);
            for (int j = 0; j < 3; j++) {
                intArray1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("두 번째 배열 %d행 ",i+1);
            for (int j = 0; j < 3; j++) {
                intArray2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((intArray1[i][j] + intArray2[i][j])+" ");
            }
            System.out.println();
        }
    }
}
