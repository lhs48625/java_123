public class Hslowerupper11177 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";

        System.out.println(str1.equals(str2)); 
        //java에서는 대문자와 소문자를 구분하기 때문에 비교했을때 false가
        //나옴 문자열이 틀리기 때문

        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        

        //tolowercase는 문자열에 있는 모든 영어를 
        // 알파벳 소문자로 바꿔주는거
        System.out.println(lowerStr1.equals(lowerStr2));

        System.out.println(str1.equalsIgnoreCase(str2));
        //equalsIgnoreCase 대문자와 소문자를 무시하고 문자열을 비교하는 기능
    }   //굳이 소문자로 바꾸지 않아도 비교가능
}
//전부 소문자 또는 대문자로 변경