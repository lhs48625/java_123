import java.util.Arrays;
import java.util.Objects;

public class Gvdeepequals111614 {
    public static void main(String[] args) {
        Integer o1 = 1000;
        Integer o2 = 1000;
        System.out.println(Objects.equals(o1, o2));
        System.out.println(Objects.equals(o1, null));
        System.out.println(Objects.equals(null, o2));
        System.out.println(Objects.equals(null, null));
        System.out.println(Objects.deepEquals(o1, o2) + "\n");

        Integer[] arr1 = {1, 2};
        Integer[] arr2 = {1, 2};
        System.out.println(Objects.equals(arr1, arr2));
        System.out.println(Objects.deepEquals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr1, arr2));
        System.out.println(Objects.deepEquals(null, arr2));
        System.out.println(Objects.deepEquals(arr1, null));
        System.out.println(Objects.deepEquals(null, null));
    }
    
}
/*
equals 참조변수 비교 
ex) o1, o2 비교
deep equals 안에 있는 값을 비교
ex) 인덱스 안에 값을 비교

null을 비교하려면 objects를 사용해야함
object에서는 null비교 안됨 */

// string만 제외하곤 deep비교 seen비교로 나눠짐


//java_객체 동등 비교