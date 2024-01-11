package OOP.advanced.stream.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student 스트림을 score 스트림 변환하고 점수를 콘솔에 출력하는 연습
public class StudentMappingEx {

    public static void main(String[] args) {
        // 1. Student 클래스 타입의 stuList 리스트 컬렉션을 생성하세요.
        List<Student> stuList = new ArrayList<>();
        // 2. Scanner 클래스로 학생의 이름과 성적을 입력받아 5명의 학생 객체 stuList 에 저장하세요
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름과 성적 입력 : ");
        for (int i = 0; i < 5; i++) {
            stuList.add(new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        System.out.println("-----");
        // 3. 학생별 이름만 저장한 nameList 를 만들고 출력하세요
        List<String> nameList = stuList.stream().map(Student::getName).toList();
        nameList.forEach(System.out::println);
        System.out.println("-----");
        // 4. 학생별 국어 점수를 저장한 korScoreList 만들고 출력하세요.
        List<Integer> korScoreList = stuList.stream().map(Student::getKorScore).toList();
        korScoreList.forEach(System.out::println);
        System.out.println("-----");
        // 5. 국어점수의 총합과 평균을 구하여 출력하세요.
        int korTotal = korScoreList.stream().reduce(0, Integer::sum);
        double korAverage = korScoreList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("국어 총합 : " + korTotal);
        System.out.println("국어 평균 : " + korAverage);
        System.out.println("-----");
        // 6. 학생별 영어점수를 저장한 engScoreList 만들고 출력하세요.
        List<Integer> engScoreList = stuList.stream().map(Student::getEngScore).toList();
        engScoreList.forEach(System.out::println);
        System.out.println("-----");
        // 7. 영어점수의 총합과 평균을 구하여 출력하세요.
        int engTotal = engScoreList.stream().reduce(0, Integer::sum);
        double engAverage = engScoreList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("국어 총합 : " + engTotal);
        System.out.println("국어 평균 : " + engAverage);
        System.out.println("-----");
        // 8. 학생별 수학점수를 저장한 mathScoreList 만들고 출력하세요.
        List<Integer> mathScoreList = stuList.stream().map(Student::getMathScore).toList();
        mathScoreList.forEach(System.out::println);
        System.out.println("-----");
        // 9. 수학점수의 총합과 평균을 구하여 출력하세요.
        int mathTotal = mathScoreList.stream().reduce(0, Integer::sum);
        double mathAverage = mathScoreList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("국어 총합 : " + mathTotal);
        System.out.println("국어 평균 : " + mathAverage);
        System.out.println("-----");
        // 10. 학생별 총합 점수와 평균을 구하여 totalExam 에 저장하여 최종 성적표를 출력하세요.

        System.out.printf("%s %-4s%-4s%-4s%-4s%-4s%-6s\n","번호","이름","국어","영어","수학","총점","평균");
        stuList.forEach(n->{
            int totalExam = n.getEngScore()+n.getKorScore()+n.getMathScore();
            System.out.printf("%d %4s %4d %4d %4d %4d %5.1f",stuList.indexOf(n)+1,
                    n.getName(),n.getKorScore(),n.getEngScore(),n.getMathScore(),totalExam,totalExam/3.0);
            System.out.println();
        });

    }
}
