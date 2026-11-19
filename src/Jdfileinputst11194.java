import java.io.FileInputStream;

public class Jdfileinputst11194 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\java_home\\java_123\\src\\Jdfileinputst11194.java");
            //stream이 붙으면 byte형식으로
            int data;
            while((data = fis.read()) != -1) {
                
                //-1이 나오면 반복문 종료 / -1파일의 끝
                System.out.write(data);
            }
            fis.close();
        }catch(Exception e) {
            e.printStackTrace();
            //오류 발생 원인 및 위치 출력
        }
    }
}
//텍스트 파일을 읽고 출력 18강