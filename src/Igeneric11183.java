import java.util.Arrays;

public class Igeneric11183 {
    public static void registerCourse(Zcourse<?> course) {
        System.out.println(course.getName() + "수강생" + 
    Arrays.toString(course.getStudents()));
    }
     public static void registerStudent(Zcourse<? extends Student> course) {
        System.out.println(course.getName() + "수강생" + 
    Arrays.toString(course.getStudents()));
     }

     public static void registerWorker(Zcourse<? super Student> course) {
        System.out.println(course.getName() + "수강생" + 
    Arrays.toString(course.getStudents()));
     }

     public static void main(String[] args) {
        Zcourse<Person> personCourse = new Zcourse<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HightStudent("고등학생"));

        Zcourse<Worker> workerCourse = new Zcourse<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Zcourse<Student> studentCourse = new Zcourse<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));




     }
}
//와일드카드 타입 매개 변수1/2
//와일드카드 타입 매개 변수2/2         13강