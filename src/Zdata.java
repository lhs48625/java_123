public class Zdata<Z> {
    Z obj;

    
    Zdata(Z ob){
        obj = ob;
    }
    Z getobj() {
        return obj;
    }
    
    void showType() {
        System.out.println("type of t :" + obj.getClass().getName());
    }
}
