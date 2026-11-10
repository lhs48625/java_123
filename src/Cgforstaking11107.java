public class Cgforstaking11107 {

    public static void main(String[] args) {
        for (int m = 9; m >= 2; m--) { //m = 9; m > 0; m--
            System.out.println("***" + m + "단 ***");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }
    }
}
//구구단 출력하기 4강
// 왼쪽보다 오른쪽이 크다 >=
//오른쪽이 왼쪽보다 크다 =<
//중첩 for 문 중괄호를 잘 봐야함