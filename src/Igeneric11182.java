public class Igeneric11182 {
    public static void main(String[] args) {
        Zdata1<Integer, String> x = new Zdata1<Integer,String>(100, "안녕");

        x.showGenericType();
        int y = x.getDa1();
        System.out.println("value : " +y);
        String d = x.getDa2();
        System.out.println("value : " + d);
    }
}
