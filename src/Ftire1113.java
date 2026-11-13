public class Ftire1113 {
        public static void main(String[] args) {
        Zzzcar car3 = new Zzzcar();

        for(int i = 1; i <= 5; i++) {
            int problem = car3.run();
          if(problem != 0) {
            System.out.println(car3.tire1[problem-1].location + "한국타이어로 교체");
            car3.tire1[problem-1] = new Ztireh(car3.tire1[problem-1].location, 15);
                
            }
            System.out.println("----------------------");
        }
    }
}
//CarExample.java_ 실행 클래스(다형성)