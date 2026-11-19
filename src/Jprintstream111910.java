import java.io.FileOutputStream;
import java.io.PrintStream;

public class Jprintstream111910 {
    public static void main(String[] args) throws Exception {
        try{
        FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
        PrintStream ps = new PrintStream(fos);

        ps.println("프린터 보조 스트림");
        ps.print("마치");
        ps.println("프린터가 출력하는 것처럼");
        ps.println("데이터를 출력합니다");
        //println은 앞에 객체가 있어야만 쓸수있다. 단독사용 불가
        //
        
        ps.flush();
        ps.close();
        fos.close();
        } catch (Exception e) {
            System.out.println("오류가 발생햇습니다.");
        }
    }
}
