import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ivinkedlist11187 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        // arraylist는 검색할 때 유리
        List<String> list2 = new LinkedList<String>();
        // linkedlist는 삽입, 삭제 할때 유리

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        } // 0은 인덱스 / valueof는 자료형 변환 ex)문자열로 변경
        endTime = System.nanoTime();

        System.out.println("ArrayList 걸린시간:" + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("linkedlist 걸린시간 :" + (endTime-startTime) + "ns");

    }
}
