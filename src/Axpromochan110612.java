public class Axpromochan110612 {
    public static void main(String[] args) {
        byte byteValue = 10; //byte 는 10이야
        int intValue = byteValue; //intValue 는 byteValue랑 같아 즉 10이야
        System.out.println("intValue: " + intValue);

        char charValue = '가'; //charValue는 '가' 야
        intValue = charValue; //intValue는 10이지만 charValue '가'이기때문에 가를 int로 변환시 유니코드로 나옴
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50; //intValue가 '가'였던 것을 다시 50으로 바꿔줘
        long longValue = intValue; //intValue(50)이건 longValue이거랑 같아
        System.out.println("longValue: " + longValue);

        longValue = 100; //longValue이걸 100으로 다시 바꿔
        float floatValue = longValue; //longValue(100)는 floatValue 이거야
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F; //floatValue를 100.5F로 다시 바꿔
        double doubleValue = floatValue; //floatValue(100.5F)는 doubleValue이거야
        System.out.println("doubleValue: " + doubleValue);
    }
    //promotion type change 자동 타입변환
}
//Promotion 타입 변환(51) 1강 중요