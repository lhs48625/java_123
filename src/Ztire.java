public class Ztire {
    //필드
    public int maxRotation;
    public int accmulatad;
    public String location;

    //생성자
    public Ztire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }
    //메서드

    public boolean roll() {
        ++accmulatad;
        if(accmulatad < maxRotation) {
            System.out.println(location + "타이어 수명 : " + (maxRotation - accmulatad) + "회");;
            return true;
        } else {
            System.out.println("***" + location + "타이어 펑크");
            return false;
        }
    }
}
