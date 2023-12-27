package Jungol.Loop.Loop3;

public class Loop9059_ex {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j <= 4 - (i - 1) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 4 - (i - 1) / 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
