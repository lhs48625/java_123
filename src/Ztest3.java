import java.util.Scanner;

public class Ztest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 80;
        int speed1 = 73;
        while (run) {
            System.out.println("-----------------");
            System.out.println("1. 총점 | 2. 평균 | 3. 중지");
            System.out.println("-----------------");
            System.out.print("선택 : ");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                int result = speed + speed1;
                System.out.println("총점 = " + result);

            } else if (strNum.equals("2")) {

                double result = (double) (speed + speed1) / 2;
                System.out.println("평균 = " + result);
            } else if (strNum.equals("3")) {
                run = false;
            }
        }
    }
}

// 키보드로 while문 제어
// nextline 은 문자갯수 상관없음