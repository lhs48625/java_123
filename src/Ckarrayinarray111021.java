public class Ckarrayinarray111021 {
    public static void main(String[] args) {
        //----------방법 1
        int[][] mathScores = new int[2][3]; //2행 3열
        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathscores[" + i + "][" + k + "] =" + mathScores[i][k]);
            }
        }

        //-------------방법 2
        System.out.println();
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2]; //2행
        englishScores[1] = new int[3]; //3열
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
            }
        }

        //--------------방법 1 응용
        System.out.println();

        int[][] javaScores = { { 95, 80 }, { 92, 96, 80, 40} }; //2행 4열
        for (int i = 0; i < javaScores.length; i++) {
            for (int k = 0; k < javaScores[i].length; k++) {
                System.out.println("javaScores[" + i + "][" + k + "] =" + javaScores[i][k]);
            }
        }
    }
}
//java_ 배열 속의 배열 5강 25페이지ㄴ
// length = index + 1 / 배열의 저장공간의 길이를 물어보는
//length는 무조건 써야함