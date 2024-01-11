package OOP.advanced.generic;
// 모든 타입의 요소 두개를 저장하고 요소를 교환하는 메서드를 구현하세요.
// 문제 1번 "Pair" 제너릭 클래스에 추가합니다.
public class Pair2<T>{
    private T first;
    private T second;


    public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair2<Integer> intPair = new Pair2(1,2);
        System.out.println(intPair.getFirst()+ "," +intPair.getSecond());
        intPair.swap();
        System.out.println("==========");
        System.out.println(intPair.getFirst()+ "," +intPair.getSecond());
    }
}
