package spl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlcon {
    
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
