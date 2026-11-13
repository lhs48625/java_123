public class Zsmarttele implements Zremote, Zsearchable{
    private int volume;
    private int volume1;

    public Zsmarttele(int volume) {
        if(volume > volume1 ) {
            this.volume = volume;
            System.out.println("현재 불륨은 : " + volume);
        }
    }

    public void turnOn() {
        System.out.println("tv켭니다");
    }
    public void turnOff(){
        System.out.println("tv끕니다");
    }
    public void setVolume(int volume) {
        if (volume > Zremote.MAX_VOLUME) {
            this.volume = Zremote.MAX_VOLUME;
            
        } else if(volume < Zremote.MIN_VOLUME){
            this.volume = Zremote.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 티비 볼륨:" +volume);
    }
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
