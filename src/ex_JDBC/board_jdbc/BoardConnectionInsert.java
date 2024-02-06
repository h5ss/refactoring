package ex_JDBC.board_jdbc;

import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class BoardConnectionInsert {
    public static Connection conn = null;
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("제목 입려~");
        String bTitle = sc.nextLine();
        System.out.println("내용 입려~");
        String bContent = sc.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul",
                "root","1004");

        String query = "INSERT INTO Board1(bTitle, bContent, bDate) " + "VALUES(?,?,now())";

        PreparedStatement pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        pstmt.setString(1,bTitle);
        pstmt.setString(2,bContent);

        pstmt.executeUpdate();

        pstmt.close();
        conn.close();
    }
}
