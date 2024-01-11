package OOP.advanced.stream.section1;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {
    // reduce() 최종연산 : 프로그래머가 직접 지정하는 연산을 적용
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김진성", "강호동동동동", "유재석", "신동엽", "서장훈");
        String name1 = names.stream()
                .reduce("이순신", (s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        System.out.println(name1);

        List<Integer> numbers = Arrays.asList(10, 5, 2, 5, 7, 7, 12, 8, 7, 2);
        // reduce()로 numbers 의 누적합, 누적곱 출력하는 문장 구현 : 슬랙 개인 제출
        System.out.println("---");
        int tmpSum = numbers.stream().reduce(0, Integer::sum);
        int tmpMul = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(tmpSum + ", " + tmpMul);


    }
}
