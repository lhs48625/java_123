public class Cicontinue111015 {
    public static void main(String[] args) throws Exception{
        for(int i = 1; i <= 10; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
//throws Exception 오류가 걸리면 정상종료
//Continue를 사용한 for문 4강 끝