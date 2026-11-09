public class Bzpitlogical110919 {
    public static void main(String[] args) {
        System.out.println("3 & 2 =" + (3 & 2)); //ANS비트단위 계산으로 답은 2, 비트단위가 1로 같은것만
        System.out.println("3 | 2 =" + (3 | 2)); //OR비트단위 계산으로 답은 3, 비트단위가 있는것 전체
        System.out.println("3 ^ 2 =" + (3 ^ 2)); //XOR비트단위 계산으로 답은 1, 비튼단위로 다른 것만 계산
        System.out.println("~45 =" + (~45));
        System.out.println("----------------------------");

        byte receiveData = -2;

        int unsignedInt1 = receiveData & 3; //음수도 양수처럼 계산
        System.out.println(unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 5;
        byte btest = (byte) test;
        System.out.println(btest);
    }
}
//(96)_비트 논리 연산자 중요* 3강