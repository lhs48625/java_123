public class Zride1 extends Zride {
    // 필드
    // ---
    @Override // 부모객체의 변수를 재정의 하는 코드 
    double myRide(double a) { // 생성자 override랑 줄간격 x
        // 부모 필드명이랑 자식 필드명이 동일해야됨
        // 메소드
        System.out.println("zride1 객체의 zride()실행"); // 이 부분만 변경 가능
        return Math.PI * a * a;
    }
}
