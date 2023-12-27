package OOP.advanced.Study_231222;

public class Account{
    private int balance;

    public void setDeposit(int deposit) {
        this.balance += deposit;
    }
    public void nowBalance(){
        System.out.println("현재 잔고는 "+ this.balance + "원 입니다.");
    }
}
