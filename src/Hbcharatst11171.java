public class Hbcharatst11171 {
    public static void main(String[] args) {
        String ssn = "010624-1230123";
        
        char sex = ssn.charAt(7);
        //인덱스 7번째 문자를 반환

        switch (sex) { //switch는 선택구문
            case '1':
            case '3':    
                System.out.println("man");
                break;
            case '2':
            case '4':
                System.out.println("woman");
                break;
        }
    }
}
//주민번호에서 남자와 여자를 구분하는 방법