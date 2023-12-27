package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram2{
    static Scanner sc = new Scanner(System.in);
    public void program(){
        int[] intArray = new int[5];
        for (int i=0; i<5; i++) {
            intArray[i] = sc.nextInt();
        }
        for (int i:intArray) {
            System.out.print(i+" ");
        }
    }
}
public class Array9065_ex {
    public static void main(String[] args) {
        ArrayProgram2 ap = new ArrayProgram2();
        ap.program();
    }
}
