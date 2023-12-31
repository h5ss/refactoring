package OOP.advanced.exception.exception1_231228;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableException {
    public static void main(String[] args) {
        ThrowableException test = new ThrowableException();
        try{
            test.loadClass("src/OOP/advanced/exception/exception1_231228/data.txt","java.lang.String");
        }catch (FileNotFoundException | ClassNotFoundException cf){ // Surround try/multi-catch 선택하여 생성
            cf.getMessage(); // 문제가 생긴 내용을 파일에 저장한 것을 log
        }catch (Exception e){
            e.printStackTrace();
        }
    }
        // throws 예외 처리 미루기 : 발생한 예외 값을 나를 호출한 위치로 다시 던져준다
        // 그래서 예외 처리는 밑에서 안 하고 위에서 하는 거임
    private Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
}
