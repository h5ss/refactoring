package javaio.ex01.lecture_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("/Users/yunhosang/Desktop/test1.txt");

            while (true){
                int data = is.read();
                if (data == -1) break;
                System.out.println(data);
            }

            is.close();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
