package OOP.advanced.generic;
// 서로 다른 두 가지 타입의 객체를 타입 매개변수로 취하는 "Pair"제너릭 클래스를 생성하세요
// 쌍의 첫번째와 두번째 객체를 나타내는 타입 T와 U의 개인 인스턴스 변수 두개 있어야 한다.
// 이 인스턴스 변수를 초기화하는 생성자와 인스턴스 변수의 값을 검색하는 getter 메서드가 있어야한다.

// 문제6 모든 타입의 요소 두개를 저장하고 요소를 교환하는 메서드를 구현하세요.
public class Pair <T,U>{
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

}
