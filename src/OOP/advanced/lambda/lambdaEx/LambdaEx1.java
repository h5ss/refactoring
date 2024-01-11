package OOP.advanced.lambda.lambdaEx;

import java.util.Arrays;
import java.util.List;

public class LambdaEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sumOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer :: intValue)
                .sum();
        System.out.println("Sum of even numbers" + sumOfEvenNumbers);

        // 정수리스트를 만듦
        // 리스트를 필터링했음
        // 각 짝수를 정수값으로 변환시키고 인트스트림의 sum 메소드 이용
    }
}
