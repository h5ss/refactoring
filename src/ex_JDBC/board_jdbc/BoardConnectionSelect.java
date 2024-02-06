package ex_JDBC.board_jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BoardConnectionSelect {
    public static Connection conn = null;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("입력~");
        int bno = sc.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul",
                "root","1004");

        String query = "SELECT * FROM Board1 where bno = ?";

        PreparedStatement pstmt = conn.prepareStatement(query);

        pstmt.setInt(1,bno);

        ResultSet rs = pstmt.executeQuery();

        if(rs.next()){
            Board board = new Board();
            board.setBno(rs.getInt("bno"));
            board.setBtitle(rs.getString("btitle"));
            board.setBcontent(rs.getString("bcontent"));
            board.setBdate(rs.getDate("bdate"));
            System.out.println(board.toString());
        }else{
            System.out.println("해당 번호의 글이 존재하지 않습니다.");
        }

        //8. 자원 해제(생성한 객체들을 .close())
        pstmt.close();
        rs.close();
        conn.close();
    }
    }

