public class Hzvaluecompare111718 {
    public static void main(String[] args) {
        System.out.println("-128~127초과값일 경우");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("결과" + (obj1 == obj2)); //overflow가 걸려서 false 즉 정확한 값을 알수없음
        System.out.println("언박싱 후 결과" + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals() 결과 " + obj1.equals(obj2));

        System.out.println("-128~127범위값일 경우");
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("결과" + (obj3 == obj4)); //overflow가 걸려서 false 즉 정확한 값을 알수없음
        System.out.println("언박싱 후 결과" + (obj3.intValue() == obj4.intValue()));
        System.out.println("equals() 결과 " + obj3.equals(obj4));
    }
}
//포장 객체 비교
/*
Integer와 int는 동일하지만
저장되는 곳이 달라서 다르게 사용
 */