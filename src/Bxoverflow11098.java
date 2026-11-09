public class Bxoverflow11098 {
    public static void main(String[] args) {
        int x = 1000000;
        int y = 1000000;
        int z = x * y; //오버플로우이기 때문에 long형으로 바꿔줘야함
        System.out.println(z);
    }
}
