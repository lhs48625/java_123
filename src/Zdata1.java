public class Zdata1<T, R> {
    T da1;
    R da2;
    Zdata1(T d1, R d2) {
        da1 = d1;
        da2 = d2;
    }
    void showGenericType(){
        System.out.println("type t :"  + da1.getClass().getName());
        System.out.println("type r :" + da2.getClass().getName());
    }
     T getDa1() {
        return da1;
    }
     R getDa2() {
        return da2;
    }
    
}
