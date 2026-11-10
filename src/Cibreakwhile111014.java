public class Cibreakwhile111014 {
    public static void main(String[] args) throws Exception {
        Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower =='g'){ 
                    break Outter;
                }
            }
        }
        System.out.println("프로그램종료");
    }
}
//A - 소문자 g까지 반복후 종료
//바깥쪽 반복문 종료