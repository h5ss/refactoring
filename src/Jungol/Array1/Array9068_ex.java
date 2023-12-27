package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram5{
    static Scanner sc = new Scanner(System.in);
    public void stopEven(){
        int[] intArray = new int[100];
        for (int i=0; i<intArray.length; i++){
            intArray[i] = sc.nextInt();
            if (intArray[i]==0){
                break;
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]!=0){
                if (i%2==1)
                    System.out.print(intArray[i]+" ");
            }
        }

    }
}
public class Array9068_ex {
    public static void main(String[] args) {
        ArrayProgram5 ap = new ArrayProgram5();
        ap.stopEven();
    }
}
