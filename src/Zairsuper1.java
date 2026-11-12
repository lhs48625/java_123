public class Zairsuper1 extends Zairsuper{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
//스태틱이라 객체 없이 클래스명으로 / 파이널이라 대문자사용 변경안됨 상수로 처리됨
    public int flyMode = NORMAL;

    @Override 
    public void fly() { //부모객체와 동일해야됨 오버라이드로 인해
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속");
        } else {
            super.fly();
        }

    } 
}
