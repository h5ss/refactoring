package OOP.advanced.lambda.lambdaQuiz;

import java.util.Arrays;
import java.util.function.Supplier;

@FunctionalInterface
interface Function<T>{
    double apply(T t);
}
class Student{
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore){
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
public class LambdaQuiz_6 {

    private static Student[] students = {
            new Student("홍길동",90,96),
            new Student("신세계",90,95)
    };

    public static double avg(Function<Student> score) {
        double average = Arrays.stream(students)
                .mapToDouble(score::apply)
                .average()
                .orElse(0.0);
//        double sum = 0;
//        for (Student student : students) {
//            sum += score.apply(student);
//        }
//        return sum / students.length;
        return average;
    }
    public static void main(String[] args) {
        //double englishAvg = avg(s->s.getEnglishScore());
        double englishAvg = avg(Student::getEnglishScore);
        System.out.println("영어 평균 점수 : "+englishAvg);

        //double mathAvg = avg(s->s.getMathScore());
        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수 : " +mathAvg);
    }
}
