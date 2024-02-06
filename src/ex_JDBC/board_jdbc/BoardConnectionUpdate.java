package ex_JDBC.board_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BoardConnectionUpdate {
    public static Connection conn = null;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("제목 입력~");
        String bTitle = sc.nextLine();
        System.out.println("내용 입력~");
        String bContent = sc.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb?serverTimezone=Asia/Seoul",
                "root", "1004");

        String query = "UPDATE Board1 SET bTitle = ?, bContent = ? WHERE bno = ?";

        PreparedStatement ps = conn.prepareStatement(query);

        ps.setString(1,bTitle);
        ps.setString(2,bContent);
        System.out.println("수정할 bno 입력 : ");
        ps.setInt(3,sc.nextInt());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
}
