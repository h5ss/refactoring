package OOP.advanced.thread.threadEx;

public class ThreadEx1 {
    public static void main(String[] args) {

        // 1. 상속으로 Thread 생성
        ThreadByInheritance t1 = new ThreadByInheritance();
        ThreadByInheritance t4 = new ThreadByInheritance();
        // 2. Runnable Interface 로 Thread 생성
        Runnable runnable = new ThreadByImplement();
        Thread t2 = new Thread(runnable);

        Thread t3 = new Thread(new ThreadByImplement());

        t1.start();
        t2.start();
        t4.start();
        //t3.start();


    }
}
class ThreadByInheritance extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(0);
        }
    }
}
class ThreadByImplement implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(1);
        }
    }
}