public class Ztest4 {
    public static void main(String[] args) {
        Zremote rc;
        rc = new Ztele(); {
            rc.turnOff();
            rc.turnOn();
        }
        rc = new Zsmarttele(0); {
            rc.turnOn();
            rc.turnOff();
            rc.setVolume(10);
        }

        Zsmarttele smart = new Zsmarttele(5);
        System.out.println(smart);

        
    }
}
