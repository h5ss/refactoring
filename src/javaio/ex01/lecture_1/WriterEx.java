package javaio.ex01.lecture_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("/Users/yunhosang/Desktop/test2.txt");
        char a = 'A';
        writer.write(a);
        char b = 'B';
        writer.write(b);

        char[] c = {'윤','호','상'};
        writer.write(c);

        String str = "신세계 자바 과정";
        writer.write(str);

        writer.flush();
        writer.close();
    }
}
