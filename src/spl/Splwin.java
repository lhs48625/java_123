package spl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Splwin {
     public static void main(String[] args) {
        Connection conn = null;
        try {
            //jdbc driver 등록
            Class.forName("oracle.jdbc.OracleDriver");

            //연결하기
            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@//localhost:1521/XE",
                "system", 
                "1234"
            );

            //매개변수화된 sql 문 작성
            String sql = "" +
            "INSERT INTO users2(userid, username, userpassword, userage, useremail)" + "VALUES(?, ?, ?, ?, ?)";

            //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter12345");
            pstmt.setString(2, "한겨울");
            pstmt.setString(3, "12345");
            pstmt.setInt(4, 19);
            pstmt.setString(5, "winter@mycompany.com");

            //sql문실행
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수 :" + rows);


            
            System.out.println("연결성공");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn != null) {
                try {
                    //연결 끊기
                    conn.close();
                    System.out.println("연결끊기");
                } catch(SQLException E) {}
            }
        }
    }
}
