package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram9{
    static Scanner sc = new Scanner(System.in);
    public void run(){
        int[] intArray = {95,75,85,100,50};
        int tmp =0;
        for (int i=0; i<intArray.length-1;i++){
            for (int j = 0; j <intArray.length-1-i ; j++) {
                if (intArray[j]>intArray[j+1]){
                    tmp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = tmp;
                }
            }
        }
        for (int j : intArray) System.out.print(j + " ");

    }
}
public class Array9073_ex {
    public static void main(String[] args) {
        ArrayProgram9 ap = new ArrayProgram9();
        ap.run();
    }
}
