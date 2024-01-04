package OOP.advanced.collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
    List<Student> studentList = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    String[] subject = {"국어","영어","수학"};

    public void getStudentDao() {
        System.out.println("학번과 이름을 입력해주세요.");
        System.out.print("학번 : ");
        String stuNo = sc.next();
        System.out.print("이름 : ");
        String name = sc.next();
        sc.nextLine();

        studentList.add(new Student(stuNo, name));
    }

    public void studentExamInsert() {

        System.out.println("성적을 입력하려고자 하는 학생의 학번을 입력하세요.");
        String stuNo = sc.nextLine();
        for (Student student : studentList) {
            if (student.getStuNo().equals(stuNo)) {
                System.out.printf("%s 점수 입력 : ",subject[0]);
                int kor = Integer.parseInt(sc.nextLine());
                System.out.printf("%s 점수 입력 : ",subject[1]);
                int eng = Integer.parseInt(sc.nextLine());
                System.out.printf("%s 점수 입력 : ",subject[2]);
                int math = Integer.parseInt(sc.nextLine());

                student.setScores(new int[]{kor, eng, math});
            }
        }
    }

    public void studentRecordPrint() {
        double total = 0;

        for (Student student : studentList) {
            total += student.getTotal();
        }
        double average = total / studentList.size();
        System.out.println(total);
        System.out.printf("%.1f\n", average);
    }

    public void studentUpdate() {
        System.out.println("성적을 수정하고자 하는 학생의 학번을 입력하세요.");
        String stuNo = sc.nextLine();
        for (Student student : studentList) {
            if (student.getStuNo().equals(stuNo)) {
                System.out.printf("수정된 %s 점수 입력 : ",subject[0]);
                int kor = Integer.parseInt(sc.nextLine());
                System.out.printf("수정된 %s 점수 입력 : ",subject[1]);
                int eng = Integer.parseInt(sc.nextLine());
                System.out.printf("수정된 %s 점수 입력 : ",subject[2]);
                int math = Integer.parseInt(sc.nextLine());

                student.setScores(new int[]{kor, eng, math});
            }
        }
    }

    public void studentPrintAll() {
        System.out.println("학생들의 정보와 점수 출력");
        for (Student student : studentList) {
            int[] printArray = student.getScores();
            System.out.println("학번이 " + student.getStuNo() + "인 " + student.getName() + " 학생의 국어, 영어, 수학 점수");
            for (int i = 0; i < printArray.length; i++) {
                System.out.printf("%s 과목의 성적은 : %d\n",subject[i],printArray[i]);
            }
            System.out.println();
        }
    }

    public void studentPickPrint() {
        System.out.println("확인하고 싶은 학생의 학번 입력");
        String stuNo = sc.nextLine();
        for (Student student : studentList) {
            if (student.getStuNo().equals(stuNo)) {
                System.out.println("학번이 " + student.getStuNo() + "인 " + student.getName() + " 학생의 국어, 영어, 수학 점수");
                int[] printArray = student.getScores();
                for (int i = 0; i < printArray.length; i++) {
                    System.out.printf("%s 과목의 성적은 : %d\n",subject[i],printArray[i]);
                }
            }
        }
    }
}
