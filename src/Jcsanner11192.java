import java.util.Scanner;

public class Jcsanner11192 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력");
        String inpuString = scanner.nextLine();
        //nextline 문자열 한줄 공백 포함 / 
        // next는 공백 미포함 공백 만나면 입력끝
        //ex) 안녕하세요 누구입니다. > 공백에서 끊겨서 안녕하세요만 출력
        System.out.println(inpuString);
        System.out.println();

        System.out.print("정수 입력");
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);
        System.out.println();

        System.out.print("실수입력");
        double inputDouble = scanner.nextDouble();
        System.out.println(inputDouble);
    }
}
// 문자열, 정수, 실수를 직접 읽는 예제 18강