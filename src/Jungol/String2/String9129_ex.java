package Jungol.String2;

import java.util.Scanner;

public class String9129_ex {
    public static double receiveDouble(double d){
        return Math.round(d*100)/100.0;
    }
    public static String receiveString(double d){
        return String.format("%.2f",receiveDouble(d));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double inputDouble1 = sc.nextDouble();
        double inputDouble2 = sc.nextDouble();
        double inputDouble3 = sc.nextDouble();

        String str1 = receiveString(inputDouble1);
        String str2 = receiveString(inputDouble2);
        String str3 = receiveString(inputDouble3);


        String allStr = str1.concat(str2).concat(str3);

        String[] strArray = allStr.split("\\.");

        for (String s : strArray) {
            System.out.printf("%s\n",s);
        }
    }
}
