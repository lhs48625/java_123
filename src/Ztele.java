public class Ztele implements Zremote {
    //implements 구현 예약어

    //필드
    private int volume;


    
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
            this.volume = Zremote.MAX_VOLUME;
            
        } else if (volume < Zremote.MIN_VOLUME){
            this.volume = Zremote.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재티비볼륨 : " + volume);
      }
    
}
