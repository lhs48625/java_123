package spl;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.IOException;

public class Sqlsnow {
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
            String sql = new StringBuilder()
            .append("UPDATE boards4 Set ")
            .append("btitle=?, ")
            .append("bcontent=?, ")
            .append("bfilename=?, ")
            .append("bfiledata=? ")
            .append("WHERE bno=?")
            .toString();

           //PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "snowman.jpg");
            pstmt.setBlob(4, new FileInputStream("C:/Temp/dal.jpg"));
            pstmt.setInt(5, 1);

            //SQL문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수 :" + rows);


            System.out.println("연결성공");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e) {
            e.printStackTrace();
        } catch(IOException e){
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
