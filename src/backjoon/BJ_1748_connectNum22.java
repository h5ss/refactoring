package backjoon;

import java.util.Scanner;

public class BJ_1748_connectNum22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNum = sc.next();
        int numLength = inputNum.length();
        int realNum = Integer.parseInt(inputNum);
        int count = 0;

        for (int i = 1; i <= numLength; i++) {
            count += (i-1) * (int)(Math.pow(10,i-1)-Math.pow(10,i-2));
        }
        count += numLength * (int)(realNum - (Math.pow(10,numLength-1)-1));

        System.out.println(count);
    }
}
