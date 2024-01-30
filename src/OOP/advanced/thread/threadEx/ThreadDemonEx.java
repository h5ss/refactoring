package OOP.advanced.thread.threadEx;

public class ThreadDemonEx {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("currentThread = "+t1);  // 현재 실행중인 스레드의 참조 값을 반환하여 출력
        // ThreadEx11 스레드 t2 만들어서 t2 의 반환값 확인
        Thread t2 = new Thread(new ThreadEx11());
        System.out.println("t2 : "+t2);


    }
}
    // ThreadEx1 클래스를 Thread 로 구현하세요
class ThreadEx11 implements Runnable{
        @Override
        public void run() {

        }
    }
