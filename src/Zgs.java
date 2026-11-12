public class Zgs {
//필드 (private 정보은닉 / 활용클래스에서는 볼 수없음)
    private int speed;
    private boolean stop;
    //생성자
    //메소드
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        //유효성 평가 
        if(speed < 0) {
            this.speed = 0;
            return ;
        }else {
            this.speed = speed;
        }
    }
      //---
public boolean isStop() { //is 다음은 필드명 / 반환값이 불리안형으로 반환
    return stop; //함수종료 / 값전달
}
public void setStop(boolean stop) {
    this.stop = stop;
    this.speed = 0;
}

    
}
