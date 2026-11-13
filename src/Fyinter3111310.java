public class Fyinter3111310 {
    public static void main(String[] args) {
        Zinterface3 face3 = new Zinterface3();

        Zinterface face = face3;
        face.method();
        System.out.println();

        Zinterface1 face1 = face3;
        face1.method1();
        System.out.println();

        Zinterface2 face2 = face3;
        face.method();
        face1.method1();
        face2.method2();
        
    
    }
}
