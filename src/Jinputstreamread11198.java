import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Jinputstreamread11198 {
 public static void main(String[] args) throws Exception {
    try {
    InputStream is = System.in;
    Reader reader = new InputStreamReader(is);

    int readCharNo;
    char [] cbuf = new char [100];
    while ((readCharNo = reader.read(cbuf)) != -1) {
        String data = new String(cbuf, 0, readCharNo);
        //cbuf 배열을 사용 > 0번 위치부터 시작(시작위치) > 
        // readcharno만큼실행(몇개가져올지)
        // -1은 종료
        System.out.println(data);
    }
    reader.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
 }   
}
//콘솔에서 한글 입력받기