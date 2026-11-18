import java.util.List;
import java.util.Vector;

public class Ivector11186 {
    public static void main(String[] args) {
        List<Zvector> list = new Vector<Zvector>();

        //Zvector은 클래스 

        list.add(new Zvector("제목1","내용1", "글쓴이1"));
        list.add(new Zvector("제목2","내용2", "글쓴이2"));
        list.add(new Zvector("제목3","내용3", "글쓴이3"));
        list.add(new Zvector("제목4","내용4", "글쓴이4"));
        list.add(new Zvector("제목5","내용5", "글쓴이5"));

        list.remove(2);
        list.remove(3);

        for(int i = 0; i < list.size(); i++) {
            Zvector vector = list.get(i);
            System.out.println(vector.subject + "\t" + vector.content + "\t" + vector.writer);
        }
    }
    
}
//객체를 저장하는 Vector
//vector은 스레드 동기화 - 복수의 스레드가 동시에 접근해 객체추가,삭제