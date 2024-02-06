package ex_JDBC.board_jdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BoardConnectionDelete {
    public static Connection conn = null;

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("bno를 입력~");

        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul",
                "root", "1004");

        String query = "DELETE FROM Board1 WHERE bno =?";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1,sc.nextInt());

        ps.executeUpdate();

        ps.close();
        conn.close();

    }
}
