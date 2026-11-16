public class Gcatchthrows11163 {
    public static void main(String[] args) {
        try {
            findclass();
        } catch(ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } 
    }
    public static void findclass() throws ClassNotFoundException{
        Class clazz = Class.forName("java.lang.String2");
}
}
//예외 처리 떠넘기기
//forName(클래스 명)