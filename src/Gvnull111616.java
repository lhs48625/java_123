import java.util.Objects;

public class Gvnull111616 {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));
        System.out.println(Objects.toString(str2, "이름이 없습니다."));
    }
}
//toString가 있는데 앞에 값이 null(str2)이면 뒤(이름이 없습니다)에 값을 출력해주겟다
//객체 문자 정보