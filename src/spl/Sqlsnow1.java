package spl;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

public class Sqlsnow1 {
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

            String sql = "" +
            "INSERT INTO boards1 (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) " +
            "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql, new String[]{"bno"});
            pstmt.setString(1, "눈오는 날");
            pstmt.setString(2, "함박눈이 내려요.");
            pstmt.setString(3, "winter");
            pstmt.setString(4, "snow.jpg");
            pstmt.setBlob(5, new FileInputStream("C:/Temp/150.jpg/"));

            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수 :" + rows);

            if(rows ==1){
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println("저장된 bno : " + bno);
                }
                rs.close();
            }
            
            


            System.out.println("연결성공");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        } 
        finally {
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
