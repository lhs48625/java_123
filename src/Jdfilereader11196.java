import java.io.FileReader;

public class Jdfilereader11196 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/Temp/book.txt");

            int read;
            char[] cb = new char[100];
            //문자갯수가 250개라면 100, 100, 50 총 3번 실행 
            while ((read = fr.read(cb)) !=-1) {
                String data = new String(cb, 0, read);
                //cb 배열을 사용 > 0번 위치부터 시작(시작위치) > read만큼실행(몇개가져올지)
                System.out.println(data);

            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// 테스트 파일 읽기 18강
//reader는 읽는거 