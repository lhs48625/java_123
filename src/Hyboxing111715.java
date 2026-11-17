public class Hyboxing111715 {
    public static void main(String[] args) {
        //boxing
        Integer obj1 = new Integer(100); // (boxing)
        Integer obj2 = new Integer("200");// 자열을 정수형으로
        Integer obj3 = Integer.valueOf("300"); // valueof메서드이용


        //unboxing
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();
        //intValue 언박싱 코드

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
//기본 타입의 값을 박싱하고 언박싱하기