public class Bzzscore110923 {
    public static void main(String[] args) {
        int score = 90;
        char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'b' : 'c');
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
}
//(100)_삼항 연산자 3강 끝