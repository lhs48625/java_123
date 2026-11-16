public class Zequals1 {
    public String id;
    public Zequals1(String id) {
        this.id = id;
    }

    @Override 
    public boolean equals(Object obj) { //객체 동등비교 obj가 객체
        if(obj instanceof Zequals1) {   //obj가 zequals1 클래스에 속해 잇나
            Zequals1 zequals1 = (Zequals1) obj;
            if (id.equals(zequals1.id)) {
                return true;
                
            }
        }
        return false;
    }
}
//object 를 직접 불러와서 재정의