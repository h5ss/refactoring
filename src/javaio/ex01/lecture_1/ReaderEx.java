package javaio.ex01.lecture_1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("/Users/yunhosang/Desktop/test2.txt");

        char[] data = new char[15];


        // 문자배열 읽기
        while (true){
            int n = reader.read(data);
            if (n == -1) break;
            for (char c : data) System.out.print(c + " ");
        }

        // 1문자씩 읽어 들이기
        Reader reader1 = new FileReader("/Users/yunhosang/Desktop/test2.txt");
        while (true){
            int n = reader1.read();
            if (n == -1) break;
            System.out.println(data);
        }
        reader.close();
    }
}
