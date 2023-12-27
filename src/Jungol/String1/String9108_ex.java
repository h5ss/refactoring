package Jungol.String1;

import java.util.Scanner;

public class String9108_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            str = sc.next();
            char c = str.charAt(0);
            System.out.printf("%s -> %d\n",str,(int)c);
            if ((int)c==48)
                System.exit(0);
        }
    }
}
