import java.io.File;
import java.io.FileWriter;

public class Jdfilewriter11197 {
    public static void main(String[] args) throws Exception{
        try{
        File file = new File("C:/Temp/file.txt");
        //파일객체생성

        FileWriter fw =new FileWriter(file, true);
        //파일에 문자를 쓰기위한 객체생성
        //true는 기존 내용 뒤에 이어서 작성 / 이어쓰기
        //false는 기존 내용 지우고 새로작성  / 덮어쓰기
        //기본값은 false
        //ex) 기존파일에 안녕하세요가 있다면 true 사용시 안녕하세요 반갑습니다
        //false는 반갑습니다만 저장
        fw.write("filewriter는 한글로된 " + "\r\r");
        // \r은 줄 맨앞으로 이동
        // \n은 줄바꿈
        fw.write("문자열을 바로 출력할 수 있다." + "\r\r");
        fw.flush();
        
        fw.close();
        System.out.println("파일에 저장되었습니다");
    }catch (Exception e) {
        e.printStackTrace();
    }

    }
}
//writer은 문자열을 사용해서 저장하는거
//문자열을 파일에 저장 18강