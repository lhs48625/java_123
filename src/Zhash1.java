public class Zhash1 {
     public int number;

    public Zhash1(int number) {
        this.number = number;

    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Zhash1) {
            Zhash1 compareKey = (Zhash1) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }
    @Override 
    public int hashCode() {
        return number;
    }
}
