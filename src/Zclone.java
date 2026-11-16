public class Zclone implements Cloneable { //java.lang에 인터페이스에서 가져온거
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Zclone(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Zclone getZclone() {
        Zclone cloned = null;
        try {
            cloned = (Zclone) clone();
        } catch (CloneNotSupportedException e) {

        }
        return cloned;
    }

    
}
//필드값만 복제
//object에서 가져다 쓴 cloneable
//String의 특징 