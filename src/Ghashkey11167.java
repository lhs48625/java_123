import java.util.HashMap;

public class Ghashkey11167 {
    public static void main(String[] args) {
        HashMap<Zhash1, String> hashMap = new HashMap<Zhash1, String>();

        hashMap.put(new Zhash1(1), "홍길동"); //java에서 쓸때 똑같이 가져와서 써야함

        String value = hashMap.get(new Zhash1(1));
        System.out.println(value);

        Object obj = new Object();
        System.out.println(obj);
        System.out.println(obj.hashCode());
    }
    
}
//메소드를 재정의추가