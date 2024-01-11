package OOP.advanced.lambda.lambdaEx;

import java.util.*;
import java.util.stream.Collectors;

interface Product{
    int calculate(List<Integer> numbers);
}
public class LambdaEx3 {
    public static void main(String[] args) {
        //1. 정수형 리스트 numbers 를 생성하세요.  리스트의 순서는 1,2,3,4,5입니다.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //2. numbers 의 값을 foreach 를 이용하여 순서대로 출력하는 람다식을 작성하세요.
        numbers.forEach(number -> System.out.println(number));
        System.out.println("----");

        Product product = products -> products.stream().reduce(1,(a, b)->a*b); // list에 있는 2,3,4 다 곱한 것/ 누적해서 곱한 거
        List<Integer> list = List.of(2,3,4);
        System.out.println(product.calculate(list)); // 결과 24
        // 누적의 합 -> reduce() 사용하면

        // 4. 이름 리스트를 알파벳 순서로 정렬하세요.
        List<String> names = Arrays.asList("John", "Jane","Adam","Eve");
//        Collections.sort(names.(a,b) -> a.compareTo(b));

        // 5. 문자열 리스트 names 를 대문자로 변환하는 람다식을 작성하세요.
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList()); // 결과를 다시 리스트로 구성을 함
        System.out.println(upperCaseNames);

        // 매개변수와 반환값이 없는 람다식도 가능


    }

}
