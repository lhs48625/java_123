public class Dspeed111110 {
    public static void main(String[] args) {
        Zspeed myCar = new Zspeed();
        myCar.keyTuenOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도 : " + speed + "km/h");
    }
}
//클래스 외부에서 메소드 호출

//get set 차이

/*void power on() /
반환형이 void면 반환 할 값이 없다는 말
출력하고 종료하는 것
*/