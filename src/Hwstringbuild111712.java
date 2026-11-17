public class Hwstringbuild111712 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java "); 
        //append는 기존 문자열 뒤에 새로운 문자열 추가
        sb.append("Program Study");
        System.out.println(sb.toString()); 
        //tostring는 string(문자열)로 변환

        sb.insert(4, "2"); 
        //insert 인덱스 4번에 숫자 2를 추가
        System.out.println(sb.toString());

        sb.setCharAt(4, '6'); 
        // setCharAt 인덱스 4번을 숫자6으로 변경
        System.out.println(sb.toString());

        sb.replace(6, 13, "Book");
         //replace 인덱스 6과 13(포함하지않음)사이에 문자열을 Book로 변경
        System.out.println(sb.toString());

        sb.delete(4, 5); 
        //delete 인덱스 4번과 5(포함하지않음)번사이 삭제
        System.out.println(sb.toString());

        int length = sb.length();
        //length 현재 문자열에 들어있는 문자의 개수 확인
        System.out.println("총 문자수 : " + length);

        String result = sb.toString();
        System.out.println(result);
    }
}
//stringbuilder은 기존 문자열의 정보가 교체
//string은 재생성 후 보여줌
//StringBuilder에서 문자열 조작