package OOP.advanced.thread.calculatorThread;

import OOP.advanced.thread.calculatorThread.Calculator;

public class User1Thread extends Thread{
    private Calculator calculator;

    public User1Thread(){
        setName("User1Thread");
    }
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);     // 동기화 메소드 호출
    }
}
