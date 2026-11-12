public class Ztireh extends Ztire{
    // 필드 x
    // 생성자
    public Ztireh(String location, int maxRotation) {
        super(location, maxRotation);
    }

    // 메서드
    @Override // 부모에게 받은 클래스 재정의
    public boolean roll() {
        ++accmulatad;
        if (accmulatad < maxRotation) {
            System.out.println(location + "한국타이어 수명 : " + (maxRotation - accmulatad) + "회");
            ;
            return true;
        } else {
            System.out.println("***" + location + "한국타이어 펑크");
            return false;
        }
    }
}
