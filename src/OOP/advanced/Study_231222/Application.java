package OOP.advanced.Study_231222;

public class Application {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setDeposit(10000);
        account1.nowBalance();
        account1.setDeposit(20000);
        account1.nowBalance();
    }
}
