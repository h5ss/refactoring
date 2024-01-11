package OOP.advanced.stream.section1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        // 1. sorted() : 스트림을 구성하는 데이터를 조건에 따라 정렬하는 연산

        List<String> stringList = Arrays.asList("홍길동 제주도 도망","풍자 먹찌빠",
                "강호동 아는 형님","유재석 유퀴즈 온더 블록","서장훈 미운 오리 새끼","신동엽 토요일이 즐겁다");

        // 2. 사전순으로 정렬
        Collections.sort(stringList);
        stringList.forEach(System.out::println);
//        stringList.stream().sorted().forEach(n-> System.out.println(n));
//        stringList.stream().sorted().forEach(System.out::println);

//        Stream<String> s1 = stringList.stream();
//        s1.sorted().forEach(System.out::println);

//        System.out.println(stringList.stream()
//        .sorted(Comparator.comparing(str->str))
//        .collect(Collectors.toList()));

//        List<String> collect = stringList.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);

        System.out.println("---");

        // 3. 람다식을 이용하여 스트림을 글자 길이 순으로 정렬
        stringList.stream()
                .sorted((s1,s2)->Integer.compare(s1.length(),s2.length()))
                //.sorted((str1,str2)-> str2.length() - str1.length())
                //.sorted(Comparator.comparing(str->str.length())
                //.sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
