public class Hreplace11175 {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 api를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        
        //한글로 된 자바를 영문 java로 바꿔라

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
/*
String은 값변경이 안되므로
newstr로 재생성이되서 
java(영어)로 바뀌는 것 
*/

//java_문자열 대치하기