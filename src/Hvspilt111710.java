public class Hvspilt111710 {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-최명호";
        String[] names = text.split("&|,|-");

        for(String name : names) { 
            // (:) 배열의 값을 하나씩 가져오는 구분자
            // 하나씩 꺼내 반복한다는 의미로 이해하면 돼
            //text > names > names > name
            System.out.println(name);
        }
    }
}
//문자열 분리
//split () 문자열 분리 
// | or 이라는 뜻 즉 & or , or - 이것을 없애줘