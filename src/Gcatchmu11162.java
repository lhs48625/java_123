public class Gcatchmu11162 {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("실행 매개값의 수가 부족, 숫자로 변환 x");
         
        } catch(Exception e) { //모든 익셉션 문제
            System.out.println("실행에 문제가 있습니다.");
        } finally{
            System.out.println("다시실행");
        }
    }
}
//Multi catch 