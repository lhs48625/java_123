public class Gcatch1116 {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException e) { //배열문제
            System.out.println("실행 매개값의 수가 부족");
            System.out.println("실행방법");
        } catch(NumberFormatException e) { //숫자문제
            System.out.println("숫자로 변호나");
        } finally{
            System.out.println("다시실행");
        }
    }
    
}
//java_다중 catch