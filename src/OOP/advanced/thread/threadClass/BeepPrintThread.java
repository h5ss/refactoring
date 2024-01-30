package OOP.advanced.thread.threadClass;

import java.awt.*;

// main 이 동시에 두가지 작업을 처리할 수 있는지 코드로 확인해 봅시다.
public class BeepPrintThread {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {

                    setName("subThread");
                    System.out.println(getName()+ " 실행 중");
                }
            };
            thread.start();
        }

        Thread mainThread = Thread.currentThread();
        mainThread.setName("I am MainThread");
        System.out.println(mainThread.getName()+"실행 중");

    }
}
