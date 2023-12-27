package 내가만든프로젝트;

import java.util.Scanner;

public class Person {
    static Scanner sc = new Scanner(System.in);
    private String cusName;
    private String cusTel;

    public Person(String cusName, String cusTel) {
        this.cusName = cusName;
        this.cusTel = cusTel;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusTel() {
        return cusTel;
    }
}
