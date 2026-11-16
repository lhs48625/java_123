public class Gucloned111611 {
    public static void main(String[] args) {
        Zclone1 original = new Zclone1("홍길동", 25, new int[] {90, 90}, new Zcarr("쏘나타"));

        Zclone1 cloned = original.getZclone1();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜져";

        System.out.println("복제객체필드값");
        System.out.println("name : " + cloned.name);
        System.out.println("age: " + cloned.age);
        System.out.println("scores : {");
        for(int i= 0; i<cloned.scores.length; i++) {
            System.out.println(cloned.scores[i]);
            System.out.println((i==(cloned.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("car: " + cloned.car.model);

        System.out.println();
        System.out.println("원본객체필드값");
        System.out.println("name: " + original.name);
        System.out.println("age : " + original.age);
        System.out.println("scores: {" );
        for(int i=0; i<original.scores.length; i++) {
            System.out.println(original.scores[i]);
            System.out.println((i==(original.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("car: " + original.car.model);

    }
}
//깊은 복제 
//깊은 복제 후 복제본 변경은 원본에영향을미치지않는다