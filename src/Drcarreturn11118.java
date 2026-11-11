public class Drcarreturn11118 {
    public static void main(String[] args) {
        Zcar4re myCar = new Zcar4re();

        myCar.setGas(5); //Zcar4re setGas() 메소드 호출

        boolean gasState = myCar.isLeftGas(); //Zcar4re의 isLeftGas() 메소드호출
        if(gasState) {
            System.out.println("출발");
            myCar.run(); //Zcar4re의 run() 메소드 호출
        }



        if (myCar.isLeftGas()) { //Zcar4re의  isLeftGas() 메소드 호출
            System.out.println("가스를 주입할필요x");
            
        } else {
            System.out.println("가스를 주입하세요");
        }
    }
}
//Car.java_return문 6강
/*void power on() /
반환형이 void면 반환 할 값이 없다는 말
출력하고 종료하는 것
*/