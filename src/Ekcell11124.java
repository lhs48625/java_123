public class Ekcell11124 {
    public static void main(String[] args) {
        //Zcell1의 객체 생성
        Zcell1 myCell = new Zcell1("자바", "검정", 10);
        //myCell은 참조변수
        
        //Zcell으로 부터 상속 받은 필드 - 즉 부모 객체로 부터 상속받은 필드
        System.out.println("모델 : " + myCell.model);
        System.out.println("색상 : " + myCell.color);

        //Zcell1의 필드 - 즉 자식 객체의 필드
        System.out.println("채널 : " + myCell.channel);

        //Zcell으로 상속받은 메소드 호출
        myCell.powerOn();
        myCell.bell();
        myCell.sendVoice("여보세요");
        myCell.receiveVoice("안녕하세요 홍길동입니다");
        myCell.sendVoice("반갑습니다.");
        myCell.hangUp();

        //Zcell1의 메소드 호출
        myCell.turnOnDmb();
        myCell.changeChannelDmb(12);
        myCell.turnOffDmb();

         //----------------------------------


        Zcell1 mycell1 = new Zcell1("폰", 20);
        System.out.println("모델 : " + mycell1.model);
        System.out.println("채널 : " + mycell1.channel);

    }
}
//Example.java _자식 클래스 사용


/*활용 클래스에서 자식 생성자 호출

자식 생성자가 부모 생성자를 호출
부모객체생성
자식객체생성
new */

//생성은 부모 먼저 호출은 자식 먼저