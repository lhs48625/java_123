import java.util.Scanner;

public class Chdowhile111012 {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while ( ! inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
//do 안에 코드를 먼저실행 후
//while의 조건 검사 조건이 true이면 다시 실행 false 반복 종료
//Do-while문