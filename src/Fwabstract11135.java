public class Fwabstract11135 {
    public static void main(String[] args) {
        Zdog dog = new Zdog();
        Zcat cat = new Zcat();
        
        dog.sound();
        cat.sound();
        System.out.println("--------");
        Zanimal animal1 = null;
        animal1 = new Zdog();
        animal1.sound();
        animal1 = new Zcat();
        animal1.sound();
        System.out.println("----------");

        animalSound(new Zdog());
        animalSound(new Zcat());
    }
    public static void animalSound(Zanimal animal) {
        animal.sound();
    }
}
//Example.java_실행 클래스

//추상클래스