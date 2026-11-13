public class Fudriver11131 {
    public static void main(String[] args) {
        Zdriver driver = new Zdriver();

        Zbus bus = new Zbus();
        Ztaxi taxi = new Ztaxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
//자식 클래스(매개 변수의 다형성)