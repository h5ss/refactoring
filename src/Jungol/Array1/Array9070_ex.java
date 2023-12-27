package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram6{
    static Scanner sc = new Scanner(System.in);
    public void run(){
        int[] intArray = new int[10];
        int max =0;
        for (int i=0; i<10; i++){
            intArray[i] = sc.nextInt();
        }
        for (int i = 1; i <10; i++) {
            max= Math.max(intArray[i-1], intArray[i]);
        }
        System.out.print(max);
    }
}
public class Array9070_ex {
    public static void main(String[] args) {
        ArrayProgram6 ap = new ArrayProgram6();
        ap.run();
    }
}
