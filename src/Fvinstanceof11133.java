public class Fvinstanceof11133 {
    public static void method1(Zzparent zzparent) {
        if(zzparent instanceof Zzchild) {
            Zzchild zzchild = (Zzchild) zzparent; //캐스팅 강제변환
            System.out.println("메서드 1 - 차일드로 변환성공");
        }else {
            System.out.println("메서드 1 - 차일드로 변환 안됨");
        }
    }
//instanceof는 매개변수 zzparent가 참조하는 객체가 Zzchild 클래스인지 조사하는것
//조사 후 if로 유효성 검사는 필수로 해야됨

    public static void method2(Zzparent zzparent) {
        Zzchild zzchild = (Zzchild) zzparent;
        System.out.println("메서드 2 - 차일드로 변환성공");
    }
    public static void main(String[] args) {
        Zzparent zzparent1 = new Zzchild();
        method1(zzparent1);
        method2(zzparent1);

        Zzparent zzparent2 = new Zzparent();
        method1(zzparent2);
        method2(zzparent2);
    }
}
//타입변환과 다형성(polymorphism)