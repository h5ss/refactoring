package OOP.advanced.interface_Bank1;

public class SHBank implements Bank{
    @Override
    public void withDraw(int price) {
        System.out.println("SH은행만의 인출 로직...");
        System.out.printf("%d 원을 인출한다.\n",price);
    }

    @Override
    public void deposit(int price) {
        System.out.printf("SH은행만의 입금 로직...%d 원을 입금한다.\n",price);
    }

    @Override
    public String findDormancyAccount(String custId) {
        System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다.");
        System.out.println("*SH은행만의 로직 적용*");
        return "00은행 000-000-0000-00";
    }
}
