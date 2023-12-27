package OOP.advanced.interface_3_231226;

public class Interface3Main {
    public static void main(String[] args) {
        // 구현객체 생성
        B b = new B();
        C c = new C();
        B bc = new C();
        System.out.println("========");

        D d = new D();
        E e = new E();
        System.out.println("========");

        //인터페이스 변수 선언
        B a;

        System.out.println("========");
        //변수에 구현 객체 대입
        a = b;      // A<===B   자동타입변환 (promotion) 객체를 다룰 때는 프로모션,캐스팅 /// 다운캐스팅이나 업캐스팅 -> 기본 값들을 다룰 때
        B b1 = a;        //A===>B 캐스팅 (casting)
        a = c;      // A<===C   자동타입변환
        C c1 = (C)a;        //A===>C 캐스팅
        a = d;      // A<===D   자동타입변환
        D d1 = (D)a;        //A===>D 캐스팅
        a = e;      // A<===E   자동타입변환
        E e1 = (E)a;        //A===>E 캐스팅



    }
}
