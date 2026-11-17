import java.io.UnsupportedEncodingException;

public class Hbytest11173 {
    public static void main(String[] args) {
        String str = "안녕하세요"; //한 글자당 2 byte / 5글자 이므로 총 10byte

        byte[] bytes1 = str.getBytes();
        System.out.println("bytes1.length : " + bytes1.length); 
        //안녕하세요가 10byte이기 때문에 10byte를 준거ㅛ
         //length 10byte / length는 문자열 길이 
        String str1 = new String(bytes1);
        System.out.println("bytes1 ->String : " + str1);

         try {
        byte[] bytes2 = str.getBytes("EUC-KR");
        System.out.println("bytes2.length :" + bytes2.length); 
        //length는 현재 문자열
        String str2 = new String("EUC-KR");
        System.out.println("BYTES2 ->String : " + str2);

        byte[] bytes3 = str.getBytes("UTF-8"); //UTF-8은 각 글자마다 3byte 할당
        System.out.println("bytes3.length :" + bytes3.length);
        String str3 = new String(bytes3, "utf-8");
        System.out.println("bytes->String:" + str3);
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    
}
//바이트 배열로 변환
