package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram{
    static Scanner sc = new Scanner(System.in);
    public void run(){
        int oddTotal = 0;
        int evenTotal = 0;
        int[] intArray = new int[10];
        for (int i=0; i<10; i++){
            intArray[i] = sc.nextInt();
        }

        for (int i=0; i<10; i++){
            if (i%2==1)
                evenTotal+=intArray[i];
            else
                oddTotal+=intArray[i];
        }
        System.out.printf("sum : %d\n",evenTotal);
        System.out.printf("avg : %.1f",(double)oddTotal/5);
    }
}
public class Array562_self8 {
    public static void main(String[] args) {
        ArrayProgram ap = new ArrayProgram();
        ap.run();
    }
}
