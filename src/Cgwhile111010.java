public class Cgwhile111010 {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while (run) {
            if(keyCode != 13 && keyCode != 10) {
                System.out.println("-----------------");
                System.out.println("1. 종속 | 2. 감속 | 3. 중지");
                System.out.println("-----------------");
                System.out.print("선택 : ");
            }

            keyCode = System.in.read();

            if (keyCode == 49) {
                speed++;
                System.out.println("현재 속도 =" + speed);
                
            }else if (keyCode == 50) {
                speed--;
                System.out.println("현재 속도 =" + speed);
            } else if (keyCode == 51) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
//키보드로 while문 제어
//keycode의 13은 내가 쓴 글 바로 밑으로 이동
//keycode의 10은 내가 쓴 글 맨 앞으로 이동
//!= 왼쪽이 오른쪽이 아니라면 true
// throws Exception = 오류가 걸리면 정상종료가 되게 만드는것
//in.read는 한문자씩 밖에 못씀
/*48 = 0 
49 = 1
50 = 2
51 = 3 
각 숫자의 문자코드 */