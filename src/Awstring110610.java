public class Awstring110610 {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머"; // 초기값 대입
        System.out.println(name);
        System.out.println(job);

        job = "안녕"; // 초기값을 두 번째 변경
        System.out.println(job);





        String str = "나는 \"자바\"를 배웁니다."; // \"문자\" = "문자" 그대로 큰따옴표까지 넣어줘
        System.out.println(str);

        str = "번호\t이름\t직업 "; // \t는 탭키 (스페이스바 4번)
        System.out.println(str); //println은 줄바꿈 까지 포함



        
        System.out.print("나는\n"); //print는 줄바꿈이 안됨 그래서
        System.out.print("자바를\n");//  \n으로 줄바꿈을 넣어줌 (\n은 줄바꿈)
        System.out.print("배웁니다.\n");
    }
}
/*String 타입(47) 1강 *중요 */