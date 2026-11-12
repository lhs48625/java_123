import java.text.SimpleDateFormat;
import java.util.Date;

public class Eimport11121 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
//a는 오전 오후를 나타내는 
//인스턴스는 임포트를 써야함
        System.out.println("오늘 날짜는 : " +date.format(today));
        System.out.println("현재 시간은 : " + time.format(today));
    }
    
}
//import문 예제 6강
//패키지 쓰고 임포트 쓰고 클래스 선언 순서로