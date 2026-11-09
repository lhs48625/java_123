public class Bzzzzcharswitchlam110932 {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수");
            }
            case 'B', 'b' -> {
                System.out.println("일반");
            }

            default -> {
                System.out.println("손님");
            }
        }
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수");
                
            case 'B', 'b' -> System.out.println("일반");  
        
            default -> System.out.println("손님");
                
        }
    }
}
//Char type의 Switch문 4강 람다식