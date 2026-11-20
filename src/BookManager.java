import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BookManager implements Manageable {

    Scanner scanner = new Scanner(System.in);
    String strNum = scanner.nextLine();

    
   @Override 
    public void addItem(Book book){
        
            if (strNum.equals("1")) {
                
                try{

                File file = new File("C:/이현석/포트폴리오/자바/test/books.txt");

                FileWriter writer = new FileWriter(file, true);

                System.out.print("[도서등록]\n");
                System.out.print("ID(숫자) :");
                int strX = scanner.nextInt();
                int s = strX;

                System.out.print("제목(문자) : ");

                String inputString = scanner.next();
                String s1 = inputString;

                System.out.print("저자(문자) : ");
                String inputString1 = scanner.next();
                String s2 = inputString1;

                writer.write("----------------------\r\n");

                writer.write("ID : " + s + "\r\n");
                writer.write("제목 : " + s1 + "\r\n");
                writer.write("저자 : " + s2 + "\r\n");

                writer.flush();
                writer.close();
                
                System.out.println("결과 : 성공적으로 등록되었습니다.");
                } catch (Exception q) {
                    System.out.println();
                    System.out.println("실패하였습니다.");
                    
                }finally{}}
              
        
    } // 데이터 추가

    @Override 
    public void displayAll(){
        if (strNum.equals("2")) {
                System.out.print("[목록조회]\n");
                try {

                    FileReader fr1 = new FileReader("C:/이현석/포트폴리오/자바/test/books.txt");

                    int read1;
                    char[] cb1 = new char[250];

                    while ((read1 = fr1.read(cb1)) != -1) {
                        String data = new String(cb1, 0, read1);

                        System.out.println(data);

                    }

                    fr1.close();
                   System.out.println("전체 목록입니다.");

                } catch (Exception e) {
                    System.out.println("등록된 도서가 없습니다.");
                }}
      

    } // 전체 목록 출력
    @Override
    public void saveToFile(){
        if (strNum.equals("3")) {
                 System.out.println();
                System.out.println("[저장 및 종료되었습니다]");
                try{
               String original = "C:/이현석/포트폴리오/자바/test/books.txt";

                String target = "C:/이현석/포트폴리오/자바/test/file1.txt";

                FileInputStream fis = new FileInputStream(original);
                FileOutputStream fos = new FileOutputStream(target);

                int read2;
                byte[] readNo = new byte[250];
                while ((read2 = fis.read(readNo)) != -1) {
                    fos.write(readNo, 0, read2);
                }
                fos.flush();

                fos.close();
                fis.close();
            } catch (Exception d) {
                System.out.println("저장할 도서가 없습니다.");
            }finally{}}

    } // 파일로 데이터 저장
    @Override
    public void loadFromFile(){
        

    } // 파일에서 데이터 로드

}
