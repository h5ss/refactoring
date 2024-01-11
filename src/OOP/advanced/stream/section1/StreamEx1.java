package OOP.advanced.stream.section1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        // 1. 정수형 배열 array 생성하고 1,2,3,4,5로 초기화
        int[] array = {1, 2, 3, 4, 5};
        // 2. array 배열에 스트림 객체 stm1 을 생성
        IntStream stm1 = Arrays.stream(array);
        Stream<Integer> stm11 = Arrays.stream(array).boxed();

        // 3. 중간연산 스트림객체 stm1 에 대해 홀수만 추출하여 스트림 객체 stm2에 저장하세요.
        IntStream stm2 = stm1.filter(n -> n % 2 == 1);
        Stream<Integer> stm22 = stm11.filter(n -> n % 2 == 1);
        // 4. stm2 스트림 객체의 총합을 구하여 출력
        int total = stm2.reduce(0, (a, b) -> a + b);
        // int total = stm2.sum();
        int total2 = stm22.collect(Collectors.summingInt(Integer::intValue));
//        int total2 = stm22.mapToInt(Integer::intValue).sum();
        // 5. 최종 결과 출력
        System.out.println(total);
        System.out.println(total2);
    }
}
