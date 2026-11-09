public class Bzoperator110918 {
    public static void main(String[] args) {
        int charCode = 'A'; //int이기 때문에 숫자로 분류

        if ((charCode >= 65) && (charCode<=90)){
            System.out.println("대문자 이군요.");
        }
        if((charCode>=97) && (charCode<=122)) { //&&(AND) 모두 참이어야함
            System.out.println("소문자 이군요");
        }
        if(!(charCode<48) && (charCode>57)) {
            System.out.println("0~9 숫자 이군요");
        }
        int value = 6;
        if ((value%2 == 0) | (value%3 == 0)) { //%는 나누고 남은나머지
            System.out.println("2 또는 3의 배수 이군요");
            
        }
        if ((value%2 == 0) || (value%3 == 0)) { //||(OR) 둘중 하나만 맞아도통과
            System.out.println("2 또는 3의 배수 이군요");
        }
    }
}
//(92)_논리 연산자 3강