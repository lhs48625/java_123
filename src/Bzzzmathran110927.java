public class Bzzzmathran110927 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        // math.random은 0.0~0.99사이 int 때문에 소수점 뒤에 반올림해서 정수로나옴
        if (num == 1)

        {
            System.out.println("1번");
        } else if (num == 2) {
            System.out.println("2번");
        } else if (num == 3) {
            System.out.println("3번");
        } else if (num == 4) {
            System.out.println("4번");
        } else if (num == 5) {
            System.out.println("5번");
        } else {
            System.out.println("6번");
        }
    }
}
