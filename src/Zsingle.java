public class Zsingle {
    
    private static Zsingle singleton = new Zsingle();
    
    private Zsingle(){}

    static Zsingle getInstance(){
        return singleton;
    }
}
