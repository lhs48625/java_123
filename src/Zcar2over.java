public class Zcar2over {

    //필드명
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;


    //생성자

    Zcar2over(){

    }
    Zcar2over(String model){
        this.model = model;
    }
    Zcar2over(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Zcar2over(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
}
//생성자 명은 클래스 명과 동일 = Zcar2
//this = 같은 클래스 안에 다른 생성자 