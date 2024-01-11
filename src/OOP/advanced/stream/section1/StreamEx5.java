package OOP.advanced.stream.section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// map() : 스트림을 구성하는 데이터를 조건에 따른 변환 중간연산

public class StreamEx5 {
    public static IntStream of(int ... values){
        return Arrays.stream(values);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "pear", "orange","banana","tomato");
        // list의 문자열을 대문자로 변환하여 출력하세요.
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("---");

        // list의 문자열을 소문자로 변환하여 출력하세요.
        list.forEach(System.out::println);
        System.out.println("---");

        // 1. of 메소드를 이용하여 직접 입력해 입력스트림을 만들 수 있습니다.
        // 2. 합계를 구하는 최종연산을 합니다.
        // 3. 변수에 최종 연산의 결과를 반환 받은 후 변수를 이용하여 값을 출력합니다.
        int total1 = IntStream.of(1,3,5,7,9).sum();
        System.out.println(total1);
        System.out.println("---");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,33,22,20,7,8);
//        int total2 = IntStream.of(numbers).sum();


        // 4. 스트림 데이터 개수를 세는 최종 연산을 합니다. count()
        long count = IntStream.of(3,5,6,7,8,9,0,10).count();
        System.out.println(count);
        System.out.println("---");

        // 5. 스트림 데이터 평균을 구하는 최종 연산을 합니다.
//        double average = IntStream.of(1,2,3,5,6,7,9).average().getAsDouble();
        IntStream.of(90,88,70,80,55,86).average().ifPresent(avg-> System.out.println("average : "+avg));
        System.out.println("---");

        // 6. 최종 연산 결과를 변수로 받지 않고 결과가 존재한다면 출력하는 처리를 합니다.
        // 7. 스트림 데이터의 최솟값을 구하는 최종 연산을 합니다.
        IntStream.of(4,1,63,7,8,3,42).min().ifPresent(min-> System.out.println("최소값 : "+min));
        System.out.println("---");

        // 7. 스트림 데이터의 최대값을 구하는 최종 연산을 합니다.
        IntStream.of(4,1,63,7,8,3,42).max().ifPresent(min-> System.out.println("최대값 : "+min));
        System.out.println("---");
    }
}
