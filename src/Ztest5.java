import java.util.Scanner;

public class Ztest5 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("-----------------");
            System.out.println("1. 총점 | 2. 평균 | 3. 중지");
            System.out.println("-----------------");

             String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                
                System.out.print("X 값 입력: ");
                String strX = scanner.nextLine();
                int x = Integer.parseInt(strX);

                System.out.print("y 값 입력: ");
                String strY = scanner.nextLine();
                double y = Double.parseDouble(strY);

                double result = x + y;
                System.out.println("x + y: " + result);
                System.out.println();

            

            } else if (strNum.equals("2")) {

                
                System.out.print("X값 입력: ");
                String strX = scanner.nextLine();
                int x = Integer.parseInt(strX);

                System.out.print("y 값 입력: ");
                String strY = scanner.nextLine();
                double y = Double.parseDouble(strY);
                
                double result = (x + y) / 2;
                System.out.println("x / y: " + result);
                System.out.println();
            
            } else if (strNum.equals("3")) {
            scanner.close();
            }
           

            
            }

        }
    }


// 키보드로 while문 제어
// nextline 은 문자갯수 상관없음

// 키보드로 while문 제어
// nextline 은 문자갯수 상관없음
