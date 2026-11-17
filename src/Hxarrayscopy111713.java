import java.util.Arrays;
public class Hxarrayscopy111713 {
    public static void main(String[] args) {
        char[] arr1 = {'J', 'A', 'V', 'A'};

        //방법 1
        char[] arr2 = Arrays.copyOf(arr1, arr1.length);
        //arr1은 원본배열 / arr1.length은 복사할 길이 
        //복사할 길이는 원본 배열의 길이보다 커도 가능, 타겟 배열의 길이
        System.out.println(Arrays.toString(arr2));

        //방법 2
        char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
        //arr1은 원본배열, 1은 시작인덱스, 3은 끝인덱스
        //시작인덱스에서 끝인덱스-1 까지 복사
        System.out.println(Arrays.toString(arr3));

        //방법 3
        char[] arr4 = new char[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        //arr1은 원본배열, 0은 원본시작인덱스, 
        // arr4는 타겟배열, 0은 타겟시작인덱스
        //arr1.length는 복사개수
        for(int i = 0; i < arr4.length; i++) {
            System.out.println("arr4[" + i + "]=" + arr4[i]);
        }

    }
    
}
//java_배열 복사 10강
//length는 문자열이나 배열에 들어있는 데이터 개수를 체크