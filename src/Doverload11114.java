public class Doverload11114 {
    public static void main(String[] args) {
        
        Zcar2over car1 = new Zcar2over("자가용");
            System.out.println("car1.com : " + car1.company);
            System.out.println();

            Zcar2over car2 = new Zcar2over("자가용");
            System.out.println("car2.com : " + car2.company);
            System.out.println("car2.model : " + car2.model);
            System.out.println();

            Zcar2over car3 = new Zcar2over("자가용", "빨강");
            System.out.println("car3.com : " + car3.company);
            System.out.println("car.model : " + car3.model);
            System.out.println("car3.color : " + car3.color);
            System.out.println();

            Zcar2over car4 = new Zcar2over("택시", "검정", 200);
            System.out.println("car4.com : " + car4.company);
            System.out.println("car4.model : " + car4.model);
            System.out.println("car4.color : " + car4.color);
            System.out.println("car4.max : " + car4.maxSpeed);
        
    }
}
//생성자의 오버로딩 6강
//Zcar2over 에서 가져옴