import java.util.HashMap;
public class Ghashkey11166 {
    public static void main(String[] args) {
        HashMap<Zhash, String> hashMap = new HashMap<Zhash, String>();

        hashMap.put(new Zhash(1), "홍길동");

        String value = hashMap.get(new Zhash(1));
        System.out.println(value);
    }
    
}
//다른키로 인식)