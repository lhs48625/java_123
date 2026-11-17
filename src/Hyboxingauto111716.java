public class Hyboxingauto111716 {
    public static void main(String[] args) {
        //자동 boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        //대입시 자동 unboxing
        int value = obj;
        System.out.println("value: " + value);

        //연산시 자동 unboxing
        int result = obj + 100;
        System.out.println("result : " + result);
    }
}
//자동 박싱하고 언박싱하기