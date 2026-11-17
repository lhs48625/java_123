public class Hzzmathrandom111719 {
    public static void main(String[] args) {
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        //abs는 절대값 양수로 반환

        System.out.println("v1 =" + v1);
        System.out.println("v2 =" + v2);

        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        //ceil은 올림값 6 / -5 큰수로 올림
        System.out.println("v3 =" + v3);
        System.out.println("v4 =" + v4);

        double v5 = Math.floor(5.3);
        double v6 = Math.floor(-5.3);
        //floor은 버림값 5 / -6 작은수로 버림
        System.out.println("v5 =" + v5);
        System.out.println("v6 =" + v6);

        double v7 = Math.max(5, 9);
        double v8 = Math.max(5.3, 2.5);
        //max은 최대값 9 / 5.3 으로 보여줌
        System.out.println("v7 =" + v7);
        System.out.println("v8 =" + v8);

        int v9 = Math.min(5, 9);
        double v10 = Math.min(5.3, 2.5);
        //min은 최솟값 5 / 2.5 로 보여줌
        System.out.println("v9 =" + v9);
        System.out.println("v10 =" + v10);

        double v11 = Math.random();
        ///random은 0.0~0.99사이 
        System.out.println("v11 =" + v11);

        double v12 = Math.rint(5.3);
        double v13 = Math.rint(5.7);
        //rint는 가까운 정수의 실수값 5 / 6 으로 반환
        System.out.println("v12 = " + v12);
        System.out.println("v13 = " + v13);

        long v14 = Math.round(5.3);
        long v15 = Math.round(5.7);
        //long round는 반올림값
        System.out.println("v14 = " + v14);
        System.out.println("v15 = " + v15);

        double value = 12.3456;
        double temp1 = value * 100; //12.3456에 100을 곱하고
        long temp2 = Math.round(temp1); //여기다가 대입 그래서 temp2 1234.56
        double v16 = temp2 / 100.0; //1234.56 나누기  100.0
        System.out.println("v16 = " + v16);
        //12.35


        
    }
}
