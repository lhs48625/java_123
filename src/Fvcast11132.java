public class Fvcast11132 {
    public static void main(String[] args) {
        Zparent par = new Zchild();  
        // 자식 타입을 부모타입으로 
        // 변환하면 차일드 클래스의 객체를 쓸 수 없음
        // 읽는 거 조차 안됨
        par.field1 = "data1";
        par.method1();
        par.method2();

        Zchild child1 = (Zchild) par; //()안에 있는게 casting 변환
        child1.field2 = "yyy";
        child1.method3();
    }
}
//강제 타입 변환(Casting)

/* 
자식이 만든 필드,메서드는
부모형으로 저장공간을 
넣어도 알 수가 없다 그러므로 캐스팅을 통해 바꿔야함 */