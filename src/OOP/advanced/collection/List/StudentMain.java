package OOP.advanced.collection.List;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        // 학생 정보 입력
        dao.getStudentDao();
        dao.getStudentDao();
        dao.getStudentDao();
        // 학생이름 입력 후 성적데이터 입력
        dao.studentExamInsert();
        dao.studentExamInsert();
        dao.studentExamInsert();
        // 학생들의 평균과 총점계산 기능
        dao.studentRecordPrint();
        // 학생 성적 데이터 수정 기능 (학번 입력)
        dao.studentUpdate();
        // 학생 전체 정보 및 성적 출력 기능
        dao.studentPrintAll();
        // 학번으로 해당 학생 데이터 정보 및 성적 출력기능
        dao.studentPickPrint();
    }
}
