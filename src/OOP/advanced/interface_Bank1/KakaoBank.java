package OOP.advanced.interface_Bank1;

public class KakaoBank implements Bank{
    @Override
    public void withDraw(int price) {
        System.out.println("Kakao은행만의 인출 로직...");
        System.out.printf("%d 원을 인출한다.",price);
    }

    @Override
    public void deposit(int price) {
        System.out.println("Kakao은행만의 입금 로직...");
        System.out.printf("%d 원을 입금한다.",price);
    }
}
