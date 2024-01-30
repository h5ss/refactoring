package javaio.ex01.lecture_2;

import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1000000000L;
    String name;
    transient Integer age;  // 직렬화에서 제외 필드

    public Member(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
