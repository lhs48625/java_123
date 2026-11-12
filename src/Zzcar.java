public class Zzcar {
    // 필드
    Ztire frontLeft = new Ztire("앞왼쪽", 6);
    Ztire frontRight = new Ztire("앞오른쪽", 2);
    Ztire backLeft = new Ztire("뒤왼쪽", 3);
    Ztire backRight = new Ztire("뒤오른쪽", 4);

    // 생성자 x

    // 메서드
    int run() {
        System.out.println("자동차가 달립니다.");
        if (frontLeft.roll() == false) { stop(); return 1;};
        if (frontRight.roll() == false) { stop(); return 2;};
        if (backLeft.roll() == false) { stop(); return 3;};
        if (backRight.roll() == false) { stop(); return 4;};
        return 0;
    }
void stop(){
    System.out.println("자동차가 멈춥니다.");
}
}
