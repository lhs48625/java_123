import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ixhashmap11189 {
    public static void main(String[] args) {
        // map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();
            //hashmap 에서 처음(string)은 key, 두번째(integer)는 value

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95); //Key 값이 동일 할 경우 값이 최신등록 값으로 변경
        System.out.println("총 entry 수: " + map.size());

        // 객체 찾기
        System.out.println("\t홍길동 :" + map.get("홍길동"));
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);

        }

        System.out.println();

        // 객체 삭제
        map.remove("홍길동");
        System.out.println("총 entry 수 :" + map.size());

        // 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }

        System.out.println();
    }
}
