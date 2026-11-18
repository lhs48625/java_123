import java.io.InputStream;
public class Ixsystemin111812 {
    public static void main(String[] args) throws Exception {
        System.out.println("===메뉴===");
        System.out.println("1. 예금 조회");
        System.out.println("2. 예금 출금");
        System.out.println("3. 예금 입금");
        System.out.println("4. 종료 하기");
        System.out.print("메뉴를 선택하세요 : ");

        InputStream is = System.in;
        //InputStream 입력데이터를 읽는 클래스 / System.in 키보드로 입력받는 기능
        char inputChar = (char) is.read();
        switch (inputChar) {
            case '1': //콘솔에서 입력하는 번호로 문자가 출력됨
                System.out.println("예금 조회를 선택하셨습니다.");
                break;
                case '2':
                System.out.println("예금 출금를 선택하셨습니다.");
                break;
                case '3':
                System.out.println("예금 입금를 선택하셨습니다.");
                break;
                case '4':
                System.out.println("종료 하기를 선택하셨습니다.");
                break;
                default:
                    System.out.println("잘못된메뉴");
                    break;
        
            
        }
    }
    
}
// 콘솔에서 입력한 번호 알아내 18강\
//input는 내가 값을 입력하면 입력한 값에 따라 다음 값이 출력됨
