package javaio.ex01.lecture_2;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args) throws Exception{
        // printf() : format string 형식화된 문자열을 출력
        // FileOutputStream 에 보조로 PrintStream 을 연결하여 print(), println(), printf() 로 문자열 출력

        FileOutputStream fs = new FileOutputStream("printStream.txt");
        PrintStream ps = new PrintStream(fs);
        ps.print("hi~");
        ps.println("오늘은 강사님이 시키는게 너무 많아서 힘들어");
        ps.printf("%d 빨리 됐으면 좋겠어",6);

        ps.flush();
        ps.close();
    }
}
