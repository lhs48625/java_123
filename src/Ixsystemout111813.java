import java.io.OutputStream;

public class Ixsystemout111813 {
    public static void main(String[] args) throws Exception{
        OutputStream os = System.out;

        for(byte b = 48; b <58; b++) {
            os.write(b);
        }
        os.write(10);

        for(byte b = 97; b < 123; b++) {
            os.write(b);
        }
        os.write(10);
        
        String hangul = "가나다라마바사아자차카타파하";
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);

        os.flush();
        //출력 버퍼 지우기 대기중인 데이터 전체 내보내기
    }
    
}
//output는 데이터가 컴퓨터에서 터미널로 바로 출력됨