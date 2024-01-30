package OOP.advanced.stream.section3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 학생별 국어점수 학생별 영어점수 학생별 수학점수 학생 이름 오름 차순 정렬, 내림 차순 정렬
// 총점과 평균.... 평균을 기준으로 오름차순 정렬
public class SortingComparableEx {
    public static void main(String[] args) {
        List<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("김나나", 90));
        studentList.add(new Student2("신지수", 89));

        // 점수(score)를 기준으로 오름차순 정렬한 새 스트림 얻어오기
        studentList.stream().sorted().forEach(student ->
                System.out.println(student.getName() + ":" + student.getScore()));

        // 점수를 기준으로 내림차순 정렬한 새 스트림 얻어오기
        studentList.stream().sorted(Comparator.reverseOrder())
                .forEach(student -> System.out.println(student.getName() + ":" + student.getScore()));

        // 만약 Comparable 인터페이스가 구현되지 않은 구현체를 정렬하려면 Comparator 를 이용한다.

        List<Student1> studentList1 = new ArrayList<>();
        studentList1.add(new Student1("김이잉", 90));
        studentList1.add(new Student1("신지아", 89));

        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 생성
        studentList1.stream().sorted((s1,s2)->Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(student1 -> System.out.println(student1.getName() + ":" + student1.getScore()));
        // studentList1.stream().sorted(Comparator.comparingInt(Student1::getScore))
        //      .forEach(student1 -> System.out.println(student1.getName() + ":" + student1.getScore()));

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 생성
        studentList1.stream().sorted((s1,s2)->Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(student1 -> System.out.println(student1.getName() + ":" + student1.getScore()));
    }
}
