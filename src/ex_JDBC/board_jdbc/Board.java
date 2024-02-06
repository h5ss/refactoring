package ex_JDBC.board_jdbc;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter@Setter
public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private Date bdate;

    @Override
    public String toString() {
        return "Board{" +
                "bno=" + bno +
                ", btitle='" + btitle + '\'' +
                ", bcontetnt='" + bcontent + '\'' +
                ", bdate=" + bdate +
                '}';
    }
}
