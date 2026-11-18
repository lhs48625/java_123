public class Igeneric11181 {
    public static void main(String[] args) {
        Zdata<Integer> d1 = new Zdata<Integer>(100);
        System.out.println(d1.getobj());
        d1.showType();

        Zdata<String> d2 = new Zdata<String>("java");
        System.out.println(d2.getobj());
        d2.showType();
    }
}
//자바 제네릭 추가 자료