import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iwhashset11188 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //set는 무순서임 / get(0) 처럼 인덱스 번호로 가져올 수 없음
        //HashSet는 같은 값을 여러번 넣어도 하나만 저장됨
        set.add("java");
        set.add("jdbc");
        set.add("servlet/jsp");
        set.add("java");
        set.add("ibatis");

        int size = set.size();
        System.out.println("총 객체수 : " + size);

        Iterator<String> iterator = set.iterator();
        //Iterator<String> 문자열을 하나씩 꺼내는 반복자
        
        while(iterator.hasNext()){
            //while는 조건식
            //hasNext() 다음에 가져올 값이 있는지 확인
            String element = iterator.next();
            //next(); 다음 값 가져와 
            System.out.println("\t" + element);
        }

        set.remove("jdbc");
        set.remove("ibatis");

        System.out.println("총 객체수 :" + set.size());

        for(String element : set) {
            //set안에 들어있는 element를 하나씩 불러오기 hashset이라 변수정해줌
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()) { System.out.println("비어있음");}
    }
}
//객체를 중복 없이 저장하는 Hashset