public class Awchar11068 {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65; //문자형에서 65는 대문자A이다
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032; //문자형에서 44032는 한글 가 이다
        char c6 = '\uac00';

        int uniCode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);
    }
}
//문자형은 한글자만됨
//정수타입(43)1강