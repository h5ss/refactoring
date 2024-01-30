package OOP.advanced.thread.calculatorThread;

import OOP.advanced.thread.calculatorThread.Calculator;

public class User2Thread extends Thread{
    private Calculator calculator;

    public User2Thread(){
        setName("User2Thread");
    }
    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);     // 동기화 메소드 호출
    }
}
