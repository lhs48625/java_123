public class Entire111211 {
    public static void main(String[] args) {
        Zzcar car2 = new Zzcar();

        for(int i = 1; i <= 5; i++) {
            int problem = car2.run();
            switch (problem) {
                case 1: //return 으로 인해 값 1
                    System.out.println("앞왼쪽 한국 타이어로 교체");
                    car2.frontLeft = new Ztireh("앞왼쪽", 15);
                    break;
                case 2: //return 으로 인해 값 2
                    System.out.println("앞오른쪽 금호 타이어로 교체");
                    car2.frontRight = new Ztireh("앞오른쪽", 13);
                    break;
                case 3: //return 으로 인해 값 3
                    System.out.println("뒤왼쪽 한국 타이어로 교체");
                    car2.backLeft = new Ztireh("뒤왼쪽", 14);
                    break;
                case 4: //return 으로 인해 값 4
                    System.out.println("뒤오른쪽 금호 타이어로 교체");
                    car2.backRight = new Ztireh("뒤오른쪽", 17);
                    break;
            
                
            }
            System.out.println("----------------------");
        }
    }
}
