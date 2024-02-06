package javaio.ex01.Memo;

import java.util.Date;

public class Memo {
    private int seq;
    private String writer;
    private String memo;
    private Date mDate;
    private String importance;

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    // 메모장 기능에 해당되는 고유번호. 만약 현재 memo.dat에 메모된 값이 총 3개라면
    // 최대값에서 +1을 해주어 그다음 메모장 고유번호의 중복이 불가하게 설정합니다.

    public int getSeq() {
        return seq;
    }

    // 확인할 메모의 고유번호를 입력받으면 그 고유번호를 확인하고 세부내용을 보여줍니다.
    public String getMemo() {
        return memo;
    }




}
