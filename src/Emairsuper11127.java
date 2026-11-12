public class Emairsuper11127 {
    public static void main(String[] args) {
        Zairsuper1 air = new Zairsuper1();
        air.takeOfff();
        air.fly();
        air.flyMode = Zairsuper1.SUPERSONIC; // 스태틱이라 클래스명을 적고 변수명을 적어야함
        air.fly();
        air.flyMode = Zairsuper1.NORMAL;
        air.fly();
        air.land();
    }
}
