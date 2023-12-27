package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram1{
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
public class Array9064_ex {
    public static void main(String[] args) {
        ArrayProgram1 ap = new ArrayProgram1();
        ap.program();
    }
}
