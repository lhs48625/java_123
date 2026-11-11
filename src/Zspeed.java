public class Zspeed {

    int speed;

    int getSpeed() {
        return speed;
    }

    void keyTuenOn() {
        System.out.println("키를 돌립니다.");
    }

    void run(){
        for(int i =0; i<=50; i+=10) {
            speed = i;
            System.out.println("달립니다(시속 : " + speed + "km/h");
            
        }
    }
}
/*void power on() /
반환형이 void면 반환 할 값이 없다는 말
출력하고 종료하는 것
*/