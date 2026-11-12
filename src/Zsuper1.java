public class Zsuper1 extends Zsuper {
    //필드명
    public int num1;
    //생성자
    public Zsuper1(String name, String ssn, int num1) {
        super(name, ssn); 
        //부모객체에서 생성자를 설정했으면 super 써야함
        //자식 생성자의 첫 줄에 써야함
        this.num1 = num1;
    }
}
