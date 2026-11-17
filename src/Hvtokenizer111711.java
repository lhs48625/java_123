import java.util.*;

public class Hvtokenizer111711 {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수";

        // 방법 1
        // how1: 전체 토큰 수를 얻어 for문으로 루핑

        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens();
        for (int i = 0; i < countTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
        }
        System.out.println();

        // 방법 2 = 더 자주 사용하는 방법
        // how2: 남아 있는 토큰을 확인하고 while문으로 루핑
        st = new StringTokenizer(text, "/"); 
        //text에서 / 이걸 기준으로 문자열을 하나씩 나눠서 가져오는것
        while (st.hasMoreTokens()) { 
            //hasMoreTokens 아직 가져오지 않은 문자열이 있는지 확인
            String token = st.nextToken();
            System.err.println(token);

        }
    }
}

// 문자열 분리

//int countTokens(), boolean hasMoreTokens(), String nextToken()
// 토큰은 문자열을 처리하는 최소단위
