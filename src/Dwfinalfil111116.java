public class Dwfinalfil111116 {
    public static void main(String[] args) {
        Zfinalfile p1 = new Zfinalfile("123456-1234567", "계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.err.println(p1.name);

        p1.name = "을지문덕";
        Zfinalfile p2 =new Zfinalfile("0000");
        System.out.println(p1.name);
        System.out.println(p2.ssn);
    }
}
//java final 필드 선언과 초기화
//final은 초기화가 끝난 값 변경안됨
//매개변수랑 필드값이 같을때 this 넣어야됨
//스태틱이 없으면 인스턴스