package Jungol.Array2;

import java.util.Scanner;

public class Array9074_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[10];
        int num ;
        while (true){
            num=sc.nextInt();
            if (num<1 || num>10)
                break;
            intArray[num-1]++;
        }
        for (int i=0; i<intArray.length;i++){
            if (intArray[i]!=0)
                System.out.printf("%d : %d개\n",i+1,intArray[i]);
        }

    }
}

