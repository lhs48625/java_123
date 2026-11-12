public class Enautotype111210 {
    public static void main(String[] args) {
        Zauto1 auto1 = new Zauto1();

        Zauto zauto = auto1;

        zauto.method1();
        zauto.method2();
    }
}
//자동 타입 변환 후의 멤버 접근
//익스텐즈를 한 자식클래스(부모객체를 참조하게 만들었음)에서
//다시 부모 클래스로 변경 가능

/*Zauto1 auto1(변수선언) = new Zauto1(자식 객체) 

        Zauto zauto(부모객체로 변환) = auto1(변수선언을); */