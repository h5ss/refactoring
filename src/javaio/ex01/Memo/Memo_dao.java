package javaio.ex01.Memo;

import java.util.Date;

public class Memo_dao {
    private int sno;
    private String writer;
    private String contents;
    private Date mDate;
    private int importance;

    public Memo_dao(int sno, String writer, String contents, Date mDate, int importance) {
        this.sno = sno;
        this.writer = writer;
        this.contents = contents;
        this.mDate = mDate;
        this.importance = importance;
    }

}
