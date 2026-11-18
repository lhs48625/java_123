import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class Ixproertyies111811 {
    public static void main(String[] args) throws Exception {
        //throws Exception 예외가 발생하면 호출한 곳으로 예외 떠넘기기

        Properties properties = new Properties();

        String path = Ixproertyies111811.class.getResource("database.properties").getPath();
         // 파일 경로 가져오기

        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));
        //해당 경로 파일읽기

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        //값 가져오기

        System.out.println("driver :" + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password :" + password);
        
    }
}
