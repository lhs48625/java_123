public class Ztest6 {
    public static void main(String[] args) {
        add1("과학", "수학");
        add2("못하겟다", "할수있다");
        add3(50, 40);
    }

    // 모듈화
    public static void add1(String data1, String data2) {
        String str[] = new String[1]; // 배열 공간할당
        try {
            str[0] = data1;
            str[1] = data2;
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException = 오류캐치

            System.out.println("실행 매개값 수 부족");
            System.out.println("실행방법");
            return;

        }
    }

    public static void add2(String data1, String data2) {
        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할수 없음");
        } finally { // 오류와 상관없이 실행
            System.out.println("다시 실행하세요");
        }
    }

    public static void add3(int a, int b) { 
        try{
            int c = a;
        int d = b;
        //  a = 100;
        //  b = 120;
        System.out.println(a + "+" + b + "=" + (a + b))
        } cat
    }

}

// String data1 = null;
// String data2 = null;

// try {
// data1 = args[0];
// data2 = args[1];
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("실행 매개값 수 부족");
// System.out.println("실행방법");
// return;

// }

// try {
// int value1 = Integer.parseInt(data1);
// int value2 = Integer.parseInt(data2);
// int result = value1 + value2;
// System.out.println(data1 + "+" + data2 + "=" + result);
// } catch (NumberFormatException e) {
// System.out.println("숫자로 변환할수 없음");
// } finally {
// System.out.println("다시 실행하세요");
// }