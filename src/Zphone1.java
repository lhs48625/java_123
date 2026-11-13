public abstract class Zphone1 {
    //필드
    public String owner;

    //생성자
    public Zphone1(String owner) {
        this.owner = owner;
    }

    //메서드
    public void turnOn(){
        System.out.println("전원 온");
    }
    public void turnOff() {
        System.out.println("전원 오프");
    }


    
}
/*일반 메서드는 선언부 처리부가 있음 하지만
추상메서드는 처리부가 없음 즉 위에 메서드 부분에서
프린트 아웃이 없고 퍼블릭 보이드 턴온만 있음  */