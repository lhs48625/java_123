public class Zcalover {

    int plus1(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg1(int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }
    
    // ------------------------------------------

    double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    double avg(double x, double y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    
//------------------------------
    void execute() {
        double result = avg(7, 10);
        System.out.println("7+10을 2로나눈결과 : " + result);
    }

    void execute(double num1, int num2) {
        double result1 = avg(num1, num2);
        double result = num1 * num2;
        System.out.println("곱하기결과 10*20 : " + result);
        System.out.println("나누기 결과10+20/2 : " + result1);
    }
    void execute(int num3, int num4) {
        int result2 = num3 + num4;
        System.out.println("더하기 결과 : " + result2);
    }

    void println(String message) {
        System.out.println(message);
    }
}
// Calculator.java_메소드 오버로딩
// 오버로드
//set 활용클래스에서 필드에 저장
//get 필드의 값을 가져오는 거