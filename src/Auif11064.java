public class Auif11064 {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1>10) {
            int v2 = v1 - 10;
            int v3 = v1 + v2 + 5;
            System.out.println(v3);
        }
        
    }
    
}
//안에서 밖으로만 할 수 있음 v1이 v2,v3을 계산할 수는 없음
/*int v1 = 15;
if(v1>10) {
int v2; 
v2 = v1 - 10;}
int v3 = v1 + v2 +5;
v2가 안에 있기 때문에 v3 = v1 + v2에서 v3는 v2를 사용할 수 없음 
하지만 v2는 v3랑 v1을 사용할 수 있음
*/

//1byte = 8bit (int(정수) = 4byte = 32bit