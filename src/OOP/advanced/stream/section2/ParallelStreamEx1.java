package OOP.advanced.stream.section2;

import java.awt.geom.Arc2D;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx1 {

    // List 컬렉션의 내부 반복자를 이용해서 병렬처리를 하는 방법
    // parallelStream() : 병렬 처리 스트림
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김진성", "강호동동동동", "유재석", "신동엽", "서장훈");

        Stream<String> parallelStream = names.parallelStream(); // 병렬 스트림 얻기
        parallelStream.forEach(name -> System.out.println(name + " : " + Thread.currentThread().getName()));
        System.out.println("-----");

        List<Student> studentList = Arrays.asList(new Student("유재석", 90),
                new Student("강호동", 80),
                new Student("신동엽", 70),
                new Student("윤호상", 100));
        System.out.println("학생 수 : " + studentList.stream().count());
        System.out.println("총합 : " + studentList.stream().map(Student::getScore).reduce(Integer::sum).orElse(0));
        System.out.println("평균 : " + studentList.stream().map(Student::getScore).mapToDouble(Integer::doubleValue).average().getAsDouble());
        System.out.println("평균2 : " + studentList.stream().mapToDouble(Student::getScore).average().orElse(0.0));
    }
}