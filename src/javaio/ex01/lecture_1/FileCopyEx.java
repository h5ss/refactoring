package javaio.ex01.lecture_1;

import java.io.*;

public class FileCopyEx {
    public static void main(String[] args) {
        String originFileName = "/Users/yunhosang/Desktop/사진/idol.jpeg";
        String targetFileName = "/Users/yunhosang/Desktop/사진/idol2.jpeg";


        try{
            InputStream is = new FileInputStream(originFileName);
            OutputStream os = new FileOutputStream(targetFileName);

            /*byte[] data = new byte[10000];

            while (true){
                int num = is.read(data);
                if (num == -1) break;
                os.write(data,0,num);
            }*/

            is.transferTo(os); // JAVA 9 버전부터 추가된 메소드

            os.flush();
            os.close();
            is.close();
            System.out.println("copy end!");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException io){
            io.printStackTrace();
        }

    }
}
