package javaio.ex01.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJson {
    public static void main(String[] args) throws IOException {
        //JSON 객체 생성
        JSONObject object = new JSONObject();

        //jSON 객체에 속성 추가
        object.put("id","sin");
        object.put("password",1234);
        object.put("student",true);

        JSONObject tel = new JSONObject();
        tel.put("home","02-455-8989");
        tel.put("mobile","010-123-1234");
        object.put("tel",tel); // 객체를 객체한테 put

        JSONArray hobby = new JSONArray();
        hobby.put("swimming");
        hobby.put("sleeping");
        object.put("hobby",hobby);


        //속성 확인하기
        String data = object.toString();


        //콘솔에 출력
        System.out.println(data);

        //파일에 저장
        Writer writer = new FileWriter("member.json", Charset.forName("UTF-8"));
        writer.write(data);
        writer.flush();
        writer.close();
    }
}
