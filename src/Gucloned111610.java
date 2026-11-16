public class Gucloned111610 {
    public static void main(String[] args) {
        Zclone original = new Zclone("blue", "홍길동", "12345", 25, true);

        Zclone cloned = original.getZclone();
        cloned.password = "67890"; //재생성 한 후 적용해야됨 string
        cloned.age = 10;

        System.out.println("복제객체필드값");
        System.out.println("id :" + cloned.id);
        System.out.println("name : " + cloned.name);
        System.out.println("password :" + cloned.password);
        System.out.println("age : " + cloned.age);
        System.out.println("adult: " + cloned.adult);

        System.out.println();

        System.out.println("원본객체필드값");
        System.out.println("id :" + original.id);
        System.out.println("name : " + original.name);
        System.out.println("password :" + original.password);
        System.out.println("age : " + original.age);
        System.out.println("adult: " + original.adult);
    }
}
//필드값만 복제
//클론메서드에 의해서 값을 복사

//얇은 값 복사
//String의 특징 

//string은 초기값이 완성된 상태에서는 변경이 안됨  
// string은 재생성> 값변경 이렇게 되는거임
//string은 equals로 비교하면 ㄷdeep 비교를해줌

//원본 객체는변함없음 10강

