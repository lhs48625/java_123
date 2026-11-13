public interface Zintermodify {
    public void method();

    public default void method1(){
        System.out.println("인터 모디파이 메서드1 실행");
    }
    
}
