package OOP.advanced.interface_.interface_1_231226;

public class ServiceMain {
    public static void main(String[] args) {
        Service service = new ServiceImpl(); // 인터페이스 변수 선언하고 구현객체 대입
        service.defaultMethod1();
        System.out.println();

        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();

    }
}
