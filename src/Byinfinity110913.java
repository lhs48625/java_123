import java.util.Scanner;

public class Byinfinity110913 {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;

        double z = x / y;
        
        System.out.println(Double.isInfinite(z)); //무한대인지 확인
        System.out.println(Double.isNaN(z)); //숫자가 아닌 값인지 확인

        System.out.println(z + 2);
        
        if(Double.isInfinite(z) || Double.isNaN(z)) { 
//z가 무한대인지 확인, z가 숫지인지 확인 ||(or) 둘중 하나라도 참이면 참
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
//nancheck 3강
//InfinityAndNaNCheckExample.java(84)
//무한대와 숫자가 아닌 값인지 확인
       