package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram8{
    static Scanner sc = new Scanner(System.in);
    public void run(){
        int[] comScore = new int[10];
        int scoreTotal = 0;
        for (int i=0; i<10; i++){
            comScore[i] = sc.nextInt();
            scoreTotal+=comScore[i];
        }
        System.out.printf("총점 = %d\n",scoreTotal);
        System.out.printf("평균 = %.1f",(double)scoreTotal/10);
    }
}
public class Array9072_ex {
    public static void main(String[] args) {
        ArrayProgram8 ap = new ArrayProgram8();
        ap.run();
    }
}
