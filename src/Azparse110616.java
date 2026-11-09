public class Azparse110616 {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10"); //""String의 값을 int형의 값으로 변환
        double value2 = Double.parseDouble("3.14"); //""String의 값을 double형 값으로 변환
        boolean value3 = Boolean.parseBoolean("true");//""String의 값을 boolean형의 값으로 변환

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(10); //valueof는 값을 변환한다는뜻
        String str2 = String.valueOf(3.14); //string는 숫자나 문자등을
        String str3 = String.valueOf(true); // 문자열로 변경

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    
    }
}
//자동타입변환(p.57~59) 1강  *중요
//String.valueOf() → 문자열로 바꾸기

//Integer.parseInt() → 정수로 바꾸기

//Double.parseDouble() → 실수로 바꾸기