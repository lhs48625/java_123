public class Gtostring11169 {
    public static void main(String[] args) {
        Ztostring phone = new Ztostring("구글", "안드로이드");

        String strObj = phone.toString();
        System.out.println(strObj);

        System.out.println(phone);


    }
}
//(tostring() 메소드)
/*기본적으로 toString()을 재정의하지 
않으면 클래스 이름과 객체의 해시 코드 등을 
포함한 문자열이 출력되기 때문.

재정의 해줘야됨 tostring로*/