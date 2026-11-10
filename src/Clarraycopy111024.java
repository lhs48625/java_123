public class Clarraycopy111024 {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5]; //null 5개

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
                        //old 시작 주소, new 목적지, 
        for(int i = 0; i < newStrArray.length; i++) {
            System.out.println(newStrArray[i] + ",");
        }
    }
}
//처음에 만들어진 값을 덮어쓰기
//System.arraycopy()로 배열 복사
//방법2