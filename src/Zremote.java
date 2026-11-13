public interface Zremote {
//상수 - 한번 정한 값을 변경 할 수 없음 / 변수 - 값을 변경 가능
//interface는 변수 사용안됨
int MAX_VOLUME = 10;
int MIN_VOLUME = 0;    
//추상메서드
void turnOn();
void turnOff();
void setVolume(int volume);

//디포트 메서드
default void setMute(boolean mute) {
    if(mute) {
        System.out.println("무음 처리");
    } else { System.out.println("무음해제");

    } 
}
//정적메서드
static void change(){
    System.out.println("건전지교체");
}
}
//java_인터페이스 변수에 구현 객체 대입