public class Hindexof11174 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location); //인덱스 3부터 시작

        if (subject.indexOf("자바") != -1) { //자바가 들어가는 문자를 찾아줘
            System.out.println("자바와 관련된 책이군요");
            
        } else {System.out.println("자바와 관련이 없는 책");}
    }
}
//문자열 포함 여부 조사
// != 두 값이 서로 다른지 비교