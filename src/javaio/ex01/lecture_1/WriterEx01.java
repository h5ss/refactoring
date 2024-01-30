package javaio.ex01.lecture_1;

// c://temp/test1.text 파일에 10 20 30 데이터를 쓰자

import java.io.*;

public class WriterEx01 {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("/Users/yunhosang/Desktop/test1.txt");
            byte [] a = {10,20,30,40,50};

//            os.write(a);
            os.write(a,0,a.length);

            os.flush();
            os.close();



        }catch (FileNotFoundException e){
            System.out.println("파일이 존재하지 않습니다.");
            // e.printStackTrace();
        }
        catch (IOException io){
            io.printStackTrace();
        }
    }
}
