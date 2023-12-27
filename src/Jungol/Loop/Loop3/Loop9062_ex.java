package Jungol.Loop.Loop3;

public class Loop9062_ex {
    public static void main(String[] args) {
        int upNum = 0;
        char upChar = 'a';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(upChar + " ");
                upChar++;
            }
            for (int j = 1; j <= 5 - i; j++) {
                upNum++;
                System.out.print(upNum + " ");
            }
            System.out.println();
        }
    }
}
