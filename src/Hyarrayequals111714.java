import java.util.Arrays;

public class Hyarrayequals111714 {
    public static void main(String[] args) {

        // 2차원 배열은 배열안에 또 다른 배열이 있는거
        // [] 대괄호 1개가 1차원, [][] 대괄호 두개가 2차원
        // 첫번쨰 [대괄호]는 행, 두번째 [대괄호는] 열

        int[][] original = {{1, 2}, {3, 4}};
        //바깥배열{{내부배열},{내부배열}}


        // 얇은 복사 후 비교
        // original 배열을 참조 해서 cloned1을 복사 / 내부배열 함께사용
        System.out.println("[얇은 복제 후 비교]");
        int[][] cloned1 = Arrays.copyOf(original, original.length);
        System.out.println("배열 번지 비교 :" + original.equals(cloned1));
        System.out.println("1차배열항목값비교 :" + Arrays.equals(original, cloned1));
        // 내부 배열의 참조를 비교 (Arrays.equals)
        System.out.println("중첩 배열 항목값 비교 :" + Arrays.deepEquals(original, cloned1));

        // 깊은 복사 후 비교
        // orignal배열을 참조해서 내부 배열까지 새롭게 복사
        System.out.println("/n[깊은 복사 후 비교]");
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        // 바깥배열{{내부배열},{내부배열}} 복사
        cloned2[0] = Arrays.copyOf(original[0], original[0].length);
        // [0] 내부 배열 복사
        cloned2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println("배열 번지 비교 :" + original.equals(cloned2));
        //배열 번지다름
        System.out.println("1차배열항목값비교 :" + Arrays.equals(original, cloned2));
        //배열 주소 다름
        System.out.println("중첩 배열 항목값 비교 :" + Arrays.deepEquals(original, cloned2));
    }
    
}
// java_배열 비교 10강

// Arrays.equals(배열, 배열) - 1차 항목의 값만 비교
// Arrays.deepEquals(배열, 배열) - 중첩된 배열의 항목까지 비교

/*
바깥 배열 / 내부 배열을 담는 배열 /original

내부 배열 / 바깥 배열 안에 들어 있는 배열 / original[0]

1차원 배열 / 대괄호 한 쌍 / int[]

중첩 배열 / 배열 안에 배열이 있는 구조 / int[][] 
*/