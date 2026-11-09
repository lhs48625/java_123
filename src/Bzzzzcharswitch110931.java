public class Bzzzzcharswitch110931 {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A': //알파벳 순서대로 대문자에서 소문자로
            case 'a':
                System.out.println("우수");

                break;
            case 'B':
            case 'b':
                System.out.println("일반");

            default:
                System.out.println("손님");
        }
    }
}
