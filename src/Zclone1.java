
import java.util.Arrays;

public class Zclone1 implements Cloneable {

    public String name;
    public int age;
    public int[] scores;
    public Zcarr car;

    public Zclone1(String name, int age, int[] scores, Zcarr car){
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }
    @Override 
    protected Object clone() throws CloneNotSupportedException {
        //먼저 얕은 복사를 해서 name, age를 복제한다.
        Zclone1 cloned = (Zclone1) super.clone();
        //scores 복제
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        //car 복제
        cloned.car = new Zcarr(this.car.model);
        return cloned;
    }
    public Zclone1 getZclone1() {
        Zclone1 cloned = null;
        try {
            cloned = (Zclone1) clone();
        } catch (CloneNotSupportedException e) {

        } 
        return cloned;
    }
    
}
