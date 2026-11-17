public class Hbstringequals11172 {
    public static void main(String[] args) {
        String strVal1 = new String("신민철");
        String strVal2 = "신민철";
        String strVal3 = "신민철";

        if (strVal1 == strVal2) {
            System.out.println("같은 String 객체를 참조");

        } else {
            System.out.println("다른 String 객체를 참조"); //주소비교 seen비교
        }

        if (strVal1.equals(strVal2)) {
            System.out.println("같은 문자열을 가짐"); //주소 안에 내용비교 / equals deep비교
            
        } else {
            System.out.println("다른 문자열을 가짐");
        }



        if (strVal2.equals(strVal3)) {
            System.out.println("같은 문자열");
        }else {
            System.out.println("다른 문자열");
        }

        if (strVal2 == strVal3) {
            System.out.println("같은 문자열");

        } else {
            System.out.println("다른 문자열");
        }
    }
}
//StringEqualsExample.java_문자열 비교
//equals 문자열 비교