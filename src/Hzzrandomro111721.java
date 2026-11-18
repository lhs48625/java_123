import java.util.Arrays;
import java.util.Random;


public class Hzzrandomro111721 {
    public static void main(String[] args) {
        //선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(1); 
        //3을 기준으로 한 값 / 시드값임
        // 시드값 변수에 선택번호 시드값과 당첨번호의 시드값을
        // 을 동일하게 하면 값이 동일하게 나옴
        System.out.println("당첨번호 :");
        System.out.println("선택 번호: ");
        for(int i = 0; i < 6; i++){
            selectNumber[i] = random.nextInt(45) +1;
            //nextInt (45)의 미만까지
            System.out.println(selectNumber[i] + " ");
        }
        System.out.println();



        //당첨번호
        int[] winningNumber = new int[6];
        random = new Random(5); 
        // 2을 기준으로 한 값 
        // 시드값 변수에 선택번호 시드값과 당첨번호의 시드값을
        // 을 동일하게 하면 값이 동일하게 나옴
        System.out.println("당첨번호 :");
        for(int i = 0; i<6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i] + "");
        }
        System.out.println();



        //당첨여부
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.println("당첨여부 : ");
        if(result) {
            System.out.println("1등에 당첨");
        } else {
            System.out.println("당첨되지않았습니다.");
        }
    }
}
//로또 번호 얻기