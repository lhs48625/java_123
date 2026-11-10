public class Clarraycopy111023 {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        for(int i = 0; i < oldIntArray.length; i++){
            //old 길이
            newIntArray[i] = oldIntArray[i];
            //old 1값이 new의 0인덱스의 값을 1로 바뀜
        }
        for(int i = 0; i < newIntArray.length; i++) {
            //new 길이 5, int이므로 저절로 들어가는 기본값은 0
            System.err.println(newIntArray[i] + ",");
        }
    }
}
//for문으로 배열 복사 5강
//방법1