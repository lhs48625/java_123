public class Gcthrow11164 {
    public static void main(String[] args) {
        Zaccount zaccount = new Zaccount();

        zaccount.deposit(10000);
        System.out.println("예금액 :" + zaccount.getBalance());

        try{zaccount.withdraw(30000);

        }catch(ZbalException e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace(); //메타데이터 익셉션이 걸린 위치 / 익셉션이 걸린 논리적 사유
        }
    }
}
//정의 예외 발생시키기 3/3 10장
//throw 예외를 직접 던짐
//throws 예외가 발생할 수 있음을 선언
/*오류가 발생했다고 자바에 알리고 
정상적인 코드 실행을 멈춘 뒤 예외를 
처리할 곳으로 전달한다는 뜻 */
//① 1번 출력 - ② throw 실행 - ③ catch로 이동 - ④ 2번 출력
/*
public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("1번");

            throw new RuntimeException("오류 발생!");

        } catch (RuntimeException e) {
            System.out.println("예외를 처리했습니다.");
        }

        System.out.println("2번");
    }
} */