public class Zcalculator1 {
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    double avg(int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }
    void execute() {
        double result = avg(7, 10);
        System.out.println("실행결과: " + result);
    }
    void println(String message) {
        System.out.println(message);
    }
}
/*void power on() /
반환형이 void면 반환 할 값이 없다는 말
출력하고 종료하는 것
*/