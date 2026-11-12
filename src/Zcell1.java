public class Zcell1 extends Zcell{
    //extends는 상속받겠다
    //필드
    int channel;

    //생성자 처음 만들때 객체 초기화
    Zcell1(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    Zcell1(String model, int channel){
        this.model = model;
        this.channel = channel;

    }
    //메소드 만들고 사용할때 기능 수행
    void  turnOnDmb() {
        System.out.println("채널" + channel + "번 dmb 방송 수신 시작");
    }
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다.");
    }
    void turnOffDmb() {
        System.out.println("dmb 방송 수신 멈춤");
    }


}
