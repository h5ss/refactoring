package Jungol.Array2;

import java.util.Scanner;

public class Array9075_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        int num, portion;
        while (true) {
            num = sc.nextInt();
            if (num == 0)
                break;
            portion = num % 10;
            intArray[portion]++;
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0)
                System.out.printf("%d : %d개\n", i, intArray[i]);
        }
    }
}
