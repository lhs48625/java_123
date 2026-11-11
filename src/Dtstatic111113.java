public class Dtstatic111113 {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Zstaticcal.pi;

        int result2 = Zstaticcal.plus(10, 5);

        int result3 = Zstaticcal.minus(10,5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
//정적 멤버 사용
//set 활용클래스에서 필드에 저장
//get 필드의 값을 가져오는 거 
//stataic으로 불러서 쓸때는 클래스명(즉 파일명)과 이름을 같이 써줘야함
//ex ) Zstaticcal.plus