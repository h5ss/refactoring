package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram4 {
    static Scanner sc = new Scanner(System.in);
    public void programArray(){
        int[] intArray = new int[10];
        for(int i = 0 ;i<10; i++){
            intArray [i] = sc.nextInt();
        }
        System.out.printf("%d %d %d",intArray[2],intArray[4],intArray[9]);
    }
}
public class Array9067_ex {
    public static void main(String[] args) {
        ArrayProgram4 ap = new ArrayProgram4();
        ap.programArray();
    }
}
