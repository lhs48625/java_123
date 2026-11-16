import java.util.Comparator;
import java.util.Objects;

public class Gvcomparator111613 {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);
        Student s3 = new Student(2);

        int result = Objects.compare(s1, s2, new StudentComparator());
        System.out.println(result);
        result = Objects.compare(s1, s3, new StudentComparator());
        System.out.println(result);
    }

//compare()는 두 객체나 값을 비교해서 그 결과를 정수(int)로 반환하는 메서드

     //클래스 객체 ----------------
    static class Student {
        int sno;
        Student(int sno) {
            this.sno = sno;
        }
    }



    //클래스 객체 -------------
    static class StudentComparator implements Comparator<Student> 
    // 컴파일 때는 object 형으로 유지시키다가 실행때 student 형으로 확정시키는 (<제네릭형>)형
     {
        @Override 
        public int compare(Student a, Student b) {
            return  Integer.compare(a.sno, b.sno);
        }
    }
    
}
//인터페이스는 생성자가 없어서 implements(구현한다) 이걸로 꼭 가져와야함
//java_비교자 10강