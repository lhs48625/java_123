public class Zcar3diff {
    
    //필드명
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;


    //생성자 생성자랑 클래스명은 동일

    Zcar3diff(){
        this("자동차", "빨강", 250);
    

    }
    Zcar3diff(String model){ //string 이 하나면 하위 클래스에서도 string이 하나인 곳을 바꿈
        this(model, "파랑", 0);
    }
    Zcar3diff(String model, String color) { //string 이 두개면 하위 클래스에서도 string이 두개인 곳을 바꿈
        this(model, color, 0);
    }

    Zcar3diff(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
