public class Zcalculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    int plus(int x, int y) {
        int result = x + y;
        return result;

    }
    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}

//return은 사용후 값전달과 함수종료

/*void power on() /
반환형이 void면 반환 할 값이 없다는 말
*/
//java_메소드 선언 6강