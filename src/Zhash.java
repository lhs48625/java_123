public class Zhash {
    public int number;

    public Zhash(int number) {
        this.number = number;

    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Zhash) {
            Zhash compareKey = (Zhash) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }
}
