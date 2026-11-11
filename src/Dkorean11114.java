public class Dkorean11114 {
    public static void main(String[] args) {
        Zkorean k1 = new Zkorean("박자바", "000000-0000000");
        System.out.println("k1.name:" + k1.name);
        System.out.println("k1.ssn:" + k1.ssn);

        Zkorean k2 = new Zkorean("김자바", "001111-1111111");
        System.out.println("k2.name: " + k2.name);
        System.out.println("k2.ssn: " + k2.ssn);
    }
}
//생성자에서 필드 초기화 6강
//Zkorean에서 가져옴