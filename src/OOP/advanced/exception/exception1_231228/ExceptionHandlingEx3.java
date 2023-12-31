package OOP.advanced.exception.exception1_231228;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingEx3 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        FileInput();
        System.out.println("[프로그램 종료]");
    }
    public static void FileInput(){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("src/OOP/advanced/exception/exception1_231228/data.txt");
            System.out.println("파일 읽기 완료");
        }catch (FileNotFoundException e){
            System.out.println("해당 파일이 존재하지 않습니다. 확인해 주세요.");
        }finally {
            try{
                if (fis != null) fis.close();
            } catch (IOException io1){
                io1.printStackTrace();
            }
            System.out.println("finally문은 항상 수행됨");
        }
        System.out.println("예외 처리 후 수행됨");
    }
}
