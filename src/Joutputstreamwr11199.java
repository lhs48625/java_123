import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Joutputstreamwr11199 {
    public static void main(String[] args) throws Exception {
        try{
        FileOutputStream fos = new FileOutputStream("C:/Temp/file5.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "나의 꿈과 희망 미소";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일저장끝");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//파일로 출력하기
//파일을 만들어서 저장