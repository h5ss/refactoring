package OOP.advanced.thread.threadEx.sleep;

import javax.swing.*;
// sleep(long millis) : 지정된 시간동안 스레드를 멈춘다. static method 이기 때문에, 사용 시 반드시
public class ThreadDemo {
    public static void main(String[] args) {
        // 사용자 입력
        // ThreadEx1 t1, t2 생성하여 시작시켜 주세요.
        // t1은 2초마다 쉬면서 동작하도록
        for (int i = 0; i < 2; i++) {
            Thread t1 = new Thread(new ThreadEx1());
            try{
                t1.start();
                Thread.sleep(1000);
            }catch (Exception e){}
        }

        Thread t2 = new Thread(new ThreadEx1());
        t2.setName("Thread2");
        t2.start();

    }
}
class ThreadEx1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.print("*");
        }
        System.out.printf("\n[%s, 종료]\n",Thread.currentThread().getName());
    }
}

//  ThreadEx1 은
// 동작순서 1. 자신의 이름을 출력   2. * 20번 출력   3. * 20번 출력한 후, 자신의 [이름, 종료] 메시지 출력
