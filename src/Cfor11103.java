public class Cfor11103 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 0;
        for(i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("1 ~ " + (i - 1) + "합 : " + sum);
    }
}

//int = i 가 for문의 밖에 있기 때문에 아웃프린트에서도 사용가능
//1부터 100까지 합 4강