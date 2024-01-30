package OOP.advanced.thread.calculatorThread;

import OOP.advanced.thread.calculatorThread.Calculator;

public class SynchronizedMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1Thread user1 = new User1Thread();
        user1.setCalculator(calculator);
        user1.start();

        User2Thread user2 = new User2Thread();
        user2.setCalculator(calculator);
        user2.start();
    }
}
