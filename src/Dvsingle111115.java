public class Dvsingle111115 {
    public static void main(String[] args) {
        Zsingle obj1 = Zsingle.getInstance();
        Zsingle obj2 = Zsingle.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른객체입니다.");
        }
    }
}
//Singleton.java 싱글톤