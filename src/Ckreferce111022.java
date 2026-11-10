public class Ckreferce111022 {
    public static void main(String[] args) {
        String[] strArry = new String[3];
        strArry[0] = "java";
        strArry[1] = "java";
        strArry[2] = new String ("java");

        System.out.println(strArry[0] == strArry[1]);
        System.out.println(strArry[0] == strArry[2]);
        System.out.println(strArry[0].equals(strArry[2]));
    }
}
//객체를 참조하는 배열 5강