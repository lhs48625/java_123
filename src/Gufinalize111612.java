public class Gufinalize111612 {
    public static void main(String[] args) {


        Zfinalize zfinalize = null;
        for(int i = 1; i <= 50; i++) {
            zfinalize = new Zfinalize(i);
            zfinalize = null;
            System.gc();
            
        }
    }
}
//메소드 실행 확인