public class Zfinalize {
    private int no;

    public Zfinalize(int no) {
        this.no = no;
    }

    @Override 
    protected void finalize() throws Throwable {  
        System.out.println(no + "번 객체의 finalize()가 실행됨");
    }
    
}
//java 가비지에서 그대로 가져와서 써야함 ex)protected void finalize()