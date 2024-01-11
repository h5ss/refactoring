package OOP.advanced.lambda.lambdaEx;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","pear","orange");

        //1. 제시되는 list 를 오름차순으로 정렬하는 람다식을 작성하세요.
        List<String> stringList = list.stream().sorted().toList(); // 내가 한 거
        System.out.println(stringList);
        System.out.println("----");

        list.sort(String::compareTo);
        System.out.println(list);

        //2. 문자열을 대문자로 변환하는 람다 표현식 작성
        System.out.println("----");
        List<String> upperCaseName = list.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseName);// 내가 한 거

        System.out.println("----");
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();
//        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> toLowerCase = (str) -> str.toLowerCase();
//        Function<String, String> toLowerCase = String::toLowerCase;

        //3. 문자열이 비어 있는지 확인하는 람다 표현식 작성
        System.out.println("----");
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));


        //4. 두 문자열을 연결하는 람다 표현식을 작성
        System.out.println("----");     // 내가 한 거
        List<String> tmpList = Arrays.asList("Hello","World");
        Optional<String> attachStr = tmpList.stream().reduce(String::concat);
        System.out.println(attachStr);

        System.out.println("----");
        BiFunction<String, String, String> concatName = String::concat;
        System.out.println(concatName.apply("자바신세계","개발자 과정"));

        //5. 숫자의 제곱을 게산하는 람다 식 작성
        System.out.println("----");          // 내가 한 거
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaredNum = numbers.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(squaredNum);

        System.out.println("----");
        Function<Integer,Integer> square = (number) -> number * number;
        System.out.println(square.apply(5));
    }
}
