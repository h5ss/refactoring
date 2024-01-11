package backjoon;

import java.util.Scanner;

public class BJ_1748_connectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNum = sc.next();
        int numLength = inputNum.length();
        int realNum = Integer.parseInt(inputNum);


        switch (numLength) {
            case 1:
                System.out.println(realNum);
                break;
            case 2:
                System.out.println(2 * (realNum - ((int) Math.pow(10, 1) - 1)) + 9);
                break;
            case 3:
                System.out.println(3 * (realNum - ((int) Math.pow(10, 2) - 1)) + 189);
                break;
            case 4:
                System.out.println(4 * (realNum - ((int) Math.pow(10, 3) - 1)) + 2889);
                break;
            case 5:
                System.out.println(5 * (realNum - ((int) Math.pow(10, 4) - 1)) + 38889);
                break;
        }
    }
}
