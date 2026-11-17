public class Htrim11178 {
    public static void main(String[] args) {
        String tel1 = "   02";
        String tel2 = "123  ";
        String tel3 = "  1234   ";

        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println(tel);
    }
}

//trim은 문자열 앞뒤로 공백 제거 하기
//java_앞뒤 공백 제거