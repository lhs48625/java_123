public class Gequalsobj11165 {
    public static void main(String[] args) {
        Zequals1 obj1 = new Zequals1("blue");
        Zequals1 obj2 = new Zequals1("blue");
        Zequals1 obj3 = new Zequals1("red");

        if (obj1.equals(obj2)) {
            System.out.println("1과 2는 동등합니다.");
            
        } else {
            System.out.println("1과 2는 동등하지 않습니다.");
        }
        if (obj1.equals(obj3)) {
            System.out.println("1과 3은 동등합니다.");
            
        }else {
            System.out.println("1과 3은 동등하지 않습니다.");
        }
    }
}
//객체 동등 비교(equals() 메소드) 2/2 
//여기서 객체는 obj
//object는 주소 비교 필드안에 있는 주소를 string처럼 비교할 수 있도록 구현
//object 를 직접 불러와서 재정의