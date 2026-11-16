public class Ztostring {
    private String company;
    private String os;

    public Ztostring(String company, String os) {
        this.company = company;
        this.os = os;
    }
    @Override 
    public String toString(){ //원하는 정보를 출력하려면 tostring 오버라이드 해야됨
           return company + "," + os;
    }
}
