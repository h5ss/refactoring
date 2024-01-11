package OOP.advanced.stream.section3;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        // 1. 정수형 배열 intArray 1,2,3,4,5 초기화하여 생성하세요.
        int[] intArray = {1,2,3,4,5};

        // intArray 를 IntStream 으로 생성
        IntStream intStream = Arrays.stream(intArray);

        // 3. intArray->IntStream->DoubleStream 변경
        intStream.asDoubleStream().forEach(System.out::println);

        intStream = Arrays.stream(intArray);
        intStream.boxed().forEach(obj-> System.out.println(obj.intValue()));
    }
}
