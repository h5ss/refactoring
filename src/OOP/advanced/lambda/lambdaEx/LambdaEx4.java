package OOP.advanced.lambda.lambdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEx4 {
    public static void main(String[] args) {
        //1. map()
        // 스트림 api -> 컬렉션에서 다양한 연산을 수행하기 위해 람다 표현식을 허용하는 메서드를 제공한다.
        // 스트림의 요소를 다른 유형으로 변환하는 데 사용 , 변환 로직을 반환하는 인수를 받습니다.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaredNum = numbers.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(squaredNum);

        //2. filter()
        // 조건에 따라 스트림에서 요소를 선택하는 데 사용(조건을 정의하는 람다 표현식을 인수로 받는다)
        //2-1. numbers 대상으로 홀수 리스트
        List<Integer> evenOfNumbers = numbers.stream().filter(n -> n%2==0).toList();
        //2-2. numbers 대상으로 짝수 리스트
        List<Integer> oddOfNumbers = numbers.stream().filter(n -> n%2==1).toList();

        //3. 집계함수 : reduce() : 스트림의 요소를 단일 값으로 집계하는 데 사용
        // (축소 연산을 정의하는 람다 표현식을 인수로 받는다.)
        int total = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("number 의 총합 집계 : "+ total);

        //4. forEach() : 스트림의 요소를 반복하고, 각 요소에 대해 작업을 수행하는 데 사용
        // (수행 작업을 정의하는 람다 표현식을 인수로 받는다.)
        numbers.stream().forEach(number -> System.out.println(number));
        numbers.forEach(System.out::println);

        //응용 문제     스트림 API를 사용하여 리스트 numbers의 평균을 구하는 람다식을 작성하세요.
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0); // orElse(0.0) -> 스트림이 비어있는 경우에는 0.0을 제공해라 // NullPointException을 피하기 위함
        System.out.println("Average : "+average);


    }
}
