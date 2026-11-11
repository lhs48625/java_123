public class Dclassfiled11112 {
    public static void main(String[] args) {
        
        Zcarclass myCar = new Zcarclass();
    
    System.out.println("제작회사:" + myCar.company);
    System.out.println("모델명:" + myCar.model);
    System.err.println("색깔:" + myCar.color);
    System.out.println("최고속도:" + myCar.maxSpeed);
    System.out.println("현재속도:" + myCar.speed);

    myCar.speed = 60;
    System.out.println("수정된 속도 :" + myCar.speed);
    }
    

    
}
//java_Car 클래스 필드 선언 