public class Bvconvert11094 {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;
        
        int result1 = v1 + v2; //byte 끼리 더해도 int 형으로 변환
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4; //
        System.out.println("reault2: " + result2);

        double result3 = (double) v1 / v2; //byte 형을 double 형으로 변환
        System.out.println("result3: " + result3);

        int result4 = v1 % v2; //나누고 나머지
        System.out.println("result4: " + result4);
    }
    
}
//증감연산자 arithmeticoperator 3강