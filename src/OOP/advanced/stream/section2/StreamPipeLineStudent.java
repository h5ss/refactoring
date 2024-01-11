package OOP.advanced.stream.section2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("유재석",99);
        Student stu2 = new Student("김재석",80);
        Student stu3 = new Student("박재석",90);
        Student stu4 = new Student("이재석",91);

        List<Student> studentList = Arrays.asList(stu1,stu2,stu3,stu4);

        // 방법1
        Stream<Student> studentStream = studentList.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double average1 = scoreStream.average().getAsDouble();

        // 방법2
        double average2 = studentList.stream()
                        .mapToInt(student -> student.getScore())
                                .average().getAsDouble();

        // 방법3
        double average3 = studentList.stream()
                        .mapToDouble(Student::getScore)
                                . average().orElse(0.0);

        studentList.stream().mapToDouble(Student::getScore).average().getAsDouble();
    }
}
