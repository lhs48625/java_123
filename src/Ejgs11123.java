public class Ejgs11123 {
    public static void main(String[] args) {
        Zgs myZgs = new Zgs();

        //잘못된 속도변경
        myZgs.setSpeed(-50);

        System.out.println("현재속도 : " + myZgs.getSpeed());

        //올바른 속도변경
        myZgs.setSpeed(60);
        

        System.out.println("현재속도 :" + myZgs.getSpeed());


        //멈춤
        if(!myZgs.isStop()) {
            myZgs.setStop(true);
        }

        System.out.println("현재속도 :" + myZgs.getSpeed());

    }
}

//java _Getter와 Setter 메소드 선언

// get, set, is 다음은 띄어쓰기 없이 필드명을 넣어야함(라이브러리)
//is는 반환값이 불리안 형으로 반환
//is 다음은 필드명 / 반환값이 불리안형으로 반환