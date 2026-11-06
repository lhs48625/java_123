public class Aycastingchan110613 {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1; //강제 타입 변환후 10은 var1은 10으로 그대로유지
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3; //long 형을 int로 강제 변환 but var3이 300인것은 그대로유지
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5; //int를 char로 강제 변환 유니코드인 A출력 but int는 65 그대로 유지
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7; //double 형을 int로 강제 변환 
        System.out.println(var8);//int는 정수형이기때문에 var8을 출력시'3'만출력 
    }// but double가 3.14인것은 변함이 없음
}
