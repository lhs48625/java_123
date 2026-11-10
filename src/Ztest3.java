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
            

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {

                System.out.println("총점 = ");

            } else if (strNum.equals("2")) {

                System.out.println("평균 = ");
            } else if (strNum.equals("3")) {
                scanner.close();
            }
            
        

            System.out.print("x 값 입력: ");
            String strX = scanner.nextLine();
            int x = Integer.parseInt(strX);

            System.out.print("y 값 입력: ");
            String strY = scanner.nextLine();
            double y = Double.parseDouble(strY);
            

            System.out.print("값 입력: ");
            String strZ = scanner.nextLine();
            if (strZ.equals("+")) {
                double result = x + y;
                System.out.println("x + y: " + result);
                System.out.println();
            } else if (strZ.equals("/")) {
                double result = (x + y) / 2;
                System.out.println("x / y: " + result);
                System.out.println();
            }

        }
    }
}

// 키보드로 while문 제어
// nextline 은 문자갯수 상관없음