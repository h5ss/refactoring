package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram7{
    static Scanner sc = new Scanner(System.in);
    public void run(){
       int[] intArray = new int[10];
       int evenMax = 0;
       int oddMin = 0;
        for (int i = 0; i < 10; i++) {
            intArray[i]=sc.nextInt();
            if (intArray[i]>9999 || intArray[i]<-9999){
                --i;
                System.out.println("4자리 이하의 정수를 입력!");
                continue;
            }
            if (intArray[i]%2==0){
                evenMax = Math.max(evenMax,intArray[i]);
            } else if (intArray[i]%2!=0) {
                oddMin = Math.min(oddMin,intArray[i]);
            }

        }System.out.printf("%d %d",oddMin,evenMax);

    }
}
public class Array9071_ex {
    public static void main(String[] args) {
        ArrayProgram7 ap = new ArrayProgram7();
        ap.run();
    }
}
