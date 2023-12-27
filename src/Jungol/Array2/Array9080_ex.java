package Jungol.Array2;

public class Array9080_ex {
    public static void main(String[] args) {
        int[][] pascal = new int[5][5];
        for (int i = 0; i < 5; i++) {
            pascal[i][0] = 1;
            for (int j = i; j < i + 1; j++) {
                pascal[i][j] = 1;
            }
        }
        pascal[1][1] = pascal[0][0] + pascal[0][1];
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                pascal[i + 1][j] = pascal[i][j - 1] + pascal[i][j];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (pascal[i][j] != 0) {
                    System.out.print(pascal[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
