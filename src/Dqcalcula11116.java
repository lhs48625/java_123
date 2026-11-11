public class Dqcalcula11116 {
    public static void main(String[] args) {
        Zcalculator myCalc = new Zcalculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        int t = 120;
        int u = 100;
        double result3 = myCalc.divide(t, u);
        System.out.println("result2 : " + result3);



        myCalc.powerOff();
    }
}
//Calculator.java_메소드 선언 6강