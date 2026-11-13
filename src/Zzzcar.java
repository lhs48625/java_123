public class Zzzcar {
      // 필드
    Ztire[] tire1 = {
        new Ztire("앞왼쪽", 6),
        new Ztire("앞오른쪽", 2),
        new Ztire("뒤왼쪽", 3),
        new Ztire("뒤오른쪽", 4)
};

    // 생성자 x

    // 메서드
    int run() {
        System.out.println("자동차가 달립니다.");
        for(int i = 0; i < tire1.length; i++) {
            if(tire1[i].roll() == false){
                stop();
                return  (i+1);
            }
        }
        return 0;
    }
void stop(){
    System.out.println("자동차가 멈춥니다.");
}
}
