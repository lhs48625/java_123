import java.util.Arrays;
import java.util.List;

public class Ilist11185 {
    public static void main(String[] args) {
        
        List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
        //asList는 (배열)을 list로 변환
        for(String name: list1) { 
            // : 이거는 하나씩꺼내라
            //즉 list1에 있는 홍길동 신용권 감자바를 하나씩 꺼내서 출력하라
            //list1에 있는 값을 하나씩 name에 넣어라
            //list라 name를

            /*
            for(int i = 0; i < list1.size(); i++) {
               System.out.println(list1.get(i))
             */
            System.out.println(name);
        }
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        for(int value:list2){
            // : 이거는 하나씩 꺼내라
            //즉 list2에 있는 1 2 3 을 하나씩 꺼내서 출력하라
            System.out.println(value);
        }
        
    }
}
