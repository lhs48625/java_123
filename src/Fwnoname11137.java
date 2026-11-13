public class Fwnoname11137{
    public static void main(String[] args) {
        
        Zremote rc = new Zremote() {
            public void turnOn(){
                System.out.println("익명턴온");
            }
            public void turnOff(){
                System.out.println("익명턴오프");
            }
            public void setVolume(int volume){
                System.out.println("불륨설정");
            }
        };
        Zsmarttele vol = new Zsmarttele(10);
        System.out.println(vol);
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(0);
    }
}
//익명구현객체
