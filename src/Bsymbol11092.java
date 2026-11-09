public class Bsymbol11092 {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x; //+는 *1을 해야됨
        int result2 = -x; //-는 *-1을 해야됨
        System.out.println("result= " + result1);
        System.out.println("result= " + result2);

        short s = 100; 
        //short result3 = -3; 컴파일 에러 연산자에서는 int로 변환
        int result3 = -s;
        System.out.println("result3= " + result3);
    }
}
