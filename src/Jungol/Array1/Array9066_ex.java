package Jungol.Array1;

import java.util.Scanner;

class ArrayProgram3{
    static Scanner sc = new Scanner(System.in);
    public void run(){
        char[] abc = new char[26];
        char c = 'A';
        char[] reverseAbc = new char[26];

        for (int i=0; i<26; i++)
            abc[i] = c++;
        for (int i=0; i<26; i++)
            reverseAbc[25-i] = abc[i];
        for (int i = 0; i < 26; i++)
            System.out.print(reverseAbc[i]+" ");
    }
}
public class Array9066_ex {
    public static void main(String[] args) {
        ArrayProgram3 ap = new ArrayProgram3();
        ap.run();
    }
}
