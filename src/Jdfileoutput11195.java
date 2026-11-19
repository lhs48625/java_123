import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Jdfileoutput11195 {
    public static void main(String[] args) throws Exception {
        try {
        String original = "C:/이현석/03_JAVA 프로그래밍_1119/교육/사진/su.jpg";
        //복제될 파일
        String target = "C:/Temp/dal1.jpg";
        //복제해서 저장할 디렉토리 및 파일명

        FileInputStream fis = new FileInputStream(original);
        FileOutputStream fos = new FileOutputStream(target);
        
    
        int read;
        byte[] readNo = new byte[100];
        while((read = fis.read(readNo)) != -1) {
            // -1은 파일끝을 나타냄
            //!= 이건 같지않다 즉 -1과 같지 않다면 true
            //read()는 파일에서 데이터를 1바이트로 읽음/읽은 데이터를 
            //정수로 반환 더 이상 읽을 데이터가 없으면 -1로 출력
            fos.write(readNo, 0, read);
        }
        fos.flush();
        //flush 남은 버퍼 모두 출력 / 남은정보
        fos.close();
        fis.close();

        //나중에 연동한 stream을 먼저 끊기 
        //즉 fos먼저 끊기*


    } catch(Exception e) {
        e.printStackTrace();
    }
    
        System.out.println("복사가 잘 되었습니다.");

    }
}
//OutputStreamExample.java 파일 복사
//그림, 오디오, 비디오, 텍스트등모든종류의데이터를파일로저장