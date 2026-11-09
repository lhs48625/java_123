public class Bzzonditional110922 {
    public static void main(String[] args) {
        int score = 79;
        char grade = 'A';
        if (score >= 90) {
            grade ='A';
            
        } else if(score >= 80) {
            grade = 'B';
        } else if(score <= 79) {
            grade = 'C';

        }
        System.out.println(score + "점은" + grade + "등급입니다");
    }
}
//조건이 있으면 if를 써야함 
//조건이 없을때는 else 끝
//(100)_삼항 연산자 3강 끝