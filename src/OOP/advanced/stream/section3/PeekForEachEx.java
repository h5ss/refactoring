package OOP.advanced.stream.section3;


import java.util.Arrays;

// 요소 루핑 : peek() 디버깅용 : 중간 처리 메소드 , forEach() : 최종 처리 메소드
public class PeekForEachEx {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        Arrays.stream(intArray).filter(num -> num % 2 == 0).peek(System.out::println);
        int total = Arrays.stream(intArray).filter(num -> num % 2 == 0).peek(System.out::println).sum();
        System.out.println(total);
    }
}
