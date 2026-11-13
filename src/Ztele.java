public class Ztele implements Zremote {
    //implements 구현 예약어

    //필드
    private int volume2;



    //turn on()의 추상 메서드의 실체 메서드
    public void turnOn() {
        System.out.println("티비온");
    }



    //turn off()의 추상메서드의 실체메서드
    public void turnOff(){
        System.out.println("티비오프");
    }



    //setvolume의 추상 메서드의 실체메서드
      public void setVolume(int volume) {
        if (volume > Zremote.MAX_VOLUME) {
            this.volume2 = Zremote.MAX_VOLUME;
            
        } else if (volume < Zremote.MIN_VOLUME){
            this.volume2 = Zremote.MIN_VOLUME;
        } else {
            this.volume2 = volume;
        }
        System.out.println("현재티비볼륨 : " + volume);
      }
    
}
//java_인터페이스 변수에 구현 객체 대입