public class Drcarreturn11118 {
    public static void main(String[] args) {
        Zcar4re myCar = new Zcar4re();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if(gasState) {
            System.out.println("출발");
            myCar.run();
        }



        if (myCar.isLeftGas()) {
            System.out.println("가스를 주입할필요x");
            
        } else {
            System.out.println("가스를 주입하세요");
        }
    }
}
//Car.java_return문 6강
