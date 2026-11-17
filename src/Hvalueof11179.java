public class Hvalueof11179 {
    public static void main(String[] args) {
        String str1 = String.valueOf(10); //valueof는 클래스 or 스태틱 멤버임
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
//string형 이외의 것을 받으면 string형으로 변경(valueof) 즉 문자열로
