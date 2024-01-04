package OOP.advanced.collection.ex;

import java.util.List;
import java.util.Vector;

// Vector는 ArrayList와 동일한 내부 구조를 가지고 있다.
// Vector는 동기화된 메소드로 구성되어 있어 멀티스레드가 동시에 Vector() 메소드를 실핼항 수 없다.
public class VectorEx1 {
    public static void main(String[] args) {
        List<Integer> list1 = new Vector<>(); // list1은 Integer 객체만 저장할 수 있다.
        List<Object> list2 = new Vector();

        list1.add(30);

        list2.add("M");
        list2.add(50);
        list2.add(30.5);
        System.out.println(list2.get(0));

        List<Board> boards = new Vector<>();
        // 작업 스레드 A
        Thread threadA = new Thread(){
            public void run(){
                for (int i = 1; i <= 1000; i++) {
                    boards.add(new Board("제목"+i, "내용"+i, "작성자"+i));
                }
            }
        };
        // 작업 스레드 B
        Thread threadB = new Thread(){
            public void run(){
                for (int i = 1001; i <= 2000; i++) {
                    boards.add(new Board("제목"+i, "내용"+i, "작성자"+i));
                }
            }
        };

        // 작업스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드들이 모두 종료될 때 까지는 메인 스레드를 기다려!
        try{
            threadA.join();
            threadB.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        int size = boards.size();
        System.out.println("총 글의 수 : " + size);

        for (Board board : boards){
            System.out.printf("%s , %s, %s\n",board.getSubject(),board.getContent(),board.getWriter());
        }
    }
}
