public class Hrsubstring11176 {
    public static void main(String[] args) {
        String ssn = "881000-1324567";

        String firstNum = ssn.substring(0, 6); 
        //주어진 시작과 끝 인덱스 사이의 문자열 추출
        // 즉 0인덱스와 6인덱스 사이
        System.out.println(firstNum);

        String sccondNum = ssn.substring(7); 
        //7인덱스 이후 부터 끝까지 문자열 추출
        System.out.println(sccondNum);
    }
}
//문자열 추출하기