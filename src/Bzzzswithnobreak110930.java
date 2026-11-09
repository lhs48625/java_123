public class Bzzzswithnobreak110930 {
    public static void main(String[] args) {
        //8<= ..<12(8+4) 사이의 정수 얻기 
        //mathrandom은 0.0~0.99 사이
        int time = (int)(Math.random()*4) + 8;
        System.out.println("현재시간:" + time + "시");

        switch(time) {
            case 8:
                System.out.println("출근");
                break;
            case 9:
                System.out.println("회의");
                break;
            case 10:
                System.out.println("업무");
                break;
        
            default:
                System.out.println("외근");
        }
    }
}
//Break문이 없는 case 4강