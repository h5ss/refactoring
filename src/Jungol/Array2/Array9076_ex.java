package Jungol.Array2;

public class Array9076_ex {
    public static void main(String[] args) {
        int[] fibonacci = new int[40];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 40; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int i = 0; i < 4; i++) {
            System.out.printf("피보나치 수열 %d항 : %d\n", 10*(i+1), fibonacci[10*i+9]);
        }
    }
}
