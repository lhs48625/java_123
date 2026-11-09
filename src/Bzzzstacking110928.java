public class Bzzzstacking110928 {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20) + 81;
        System.out.println("점수" + score);

        //math.random은 0.0~0.99사이 int 때문에 소수점 뒤에 반올림해서 정수로나옴
        String grade;
        if(score >= 90){
            if(score>=95){
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if(score>=85) {
                grade = "B+";
            }else {
                grade = "B";
            }
        }
        System.out.println("학점" + grade);
    }
}
//java_중첩If문 4강