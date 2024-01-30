package OOP.advanced.thread.threadEx.interrupt;

import javax.swing.*;

//Single Thread
// interrupt 메서드 : 쓰레드를 안전하게 종료시킬 때 사용한다.
// 스레드를 실행 도중에 종료시키고 싶을 때 사용
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadEx1());
        t1.start();
        String yes = JOptionPane.showInputDialog("게임을 다시 진행할까요? [Y/N]");

        System.out.println("isInterrupted : " + t1.isInterrupted());

        t1.interrupt();     // 실행 도중 안전하게 강제 종료
        System.out.println("isInterrupted : " + t1.isInterrupted());

    }
    static class ThreadEx1 implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            int i = 10;
            while (i!=0 && !Thread.currentThread().isInterrupted()){
                System.out.println(i--);
                for (long x = 0; x < 2500000000L ; x++) {

                }
                System.out.println(Thread.currentThread().getName()+" 카운트 다운 종료");
            }

        }
    }
}


//  ThreadEx1 은
// 동작순서 1. 자신의 이름을 출력   2. * 20번 출력   3. * 20번 출력한 후, 자신의 [이름, 종료] 메시지 출력
