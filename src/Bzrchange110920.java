public class Bzrchange110920 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3); //2의 3세제곱 = 8
        System.out.println("result1:" + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        int result3 = num2 >>3;
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
    
}
//비트이동연산 진수차이 <<이건 비트를 왼쪽으로 이동시키는연산자
//비트 기준 8421에서 8이면 8에 1 나머지에 000
//(98)_비트 이동 연산자 3강