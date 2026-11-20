import java.util.ArrayList;
import java.util.List;

public class Ilist11184 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("jdbc");
        list.add("servlet/jsp");
        list.add(2, "database"); // 앞에 숫자를 붙이면 그 숫자의 인덱스로 변경
        list.add("ibatis");

        int size = list.size(); //size는 list의 길이를 재는 것 / length는 []의 길이
        System.out.println("총 객체수 :" + size);
        System.out.println();

        String skill = list.get(2); 
        //값을 가져 오는것 리소스에 저장되어있는 값을
        //활용 클래스로 가져옴
        System.out.println("2: " + skill);
        System.out.println();

        for(int i = 0; i <list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        System.out.println();

        list.remove(2); //인덱스를 넣으면 그 공간의 인덱스를 삭제
        list.remove(2);
        list.remove("ibatis");

        for(int i= 0; i < list.size(); i++) {
        String str = list.get(i);
        System.out.println(i + ":" + str);
        }
    }
}
//객체를 저장하는 ArrayList 15강
//arrayslist 선형리스트