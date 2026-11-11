public class Dpdifferent11115 {

    public static void main(String[] args) {

        Zcar3diff car1 = new Zcar3diff();
        System.out.println("car1.com : " + car1.company);
        System.out.println("car1.model : " + car1.model);
        System.out.println("car1.color : " + car1.color);
        System.out.println("car1.max : " + car1.maxSpeed);


        System.out.println();

        Zcar3diff car2 = new Zcar3diff("자가용");
        System.out.println("car2.com : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println();

        Zcar3diff car3 = new Zcar3diff("자가용", "빨강");
        System.out.println("car3.com : " + car3.company);
        System.out.println("car.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Zcar3diff car4 = new Zcar3diff("택시", "검정", 200);
        System.out.println("car4.com : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.max : " + car4.maxSpeed);

    }

}
//다른 생성자를 호출해서 중복코드줄이기 6강
//Zcar3diff에서 가져옴
