import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Zzzzzztest {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        FileReader fr = new FileReader("C:/이현석/포트폴리오/자바/테스트 1/book.txt");

        int read;
        char[] cb = new char[100];

        while ((read = fr.read(cb)) != -1) {
            String data = new String(cb, 0, read);

            System.out.println(data);

        }
        //Jdfilereader11196 배열을 만든 후 0에서 read 까지 읽기



        fr.close();

        boolean run = true;
        while (run) {
            System.out.println();
            System.out.println("===LIBRARY SYSTEM===");
            System.out.println("1. 도서등록 | 2. 목록조회 | 3. 저장 및 종료");
            System.out.print("메뉴 선택 >>");




            String strNum = scanner.nextLine();





            if (strNum.equals("1")) {
                
                try{

                File file = new File("C:/이현석/포트폴리오/자바/테스트 1/book.txt");

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
                    
                } 
                //Joutputstreamwr11199 파일로 출력, 파일을 만들어서 저장




            } else if (strNum.equals("2")) {
                System.out.print("[목록조회]\n");
                try {

                    FileReader fr1 = new FileReader("C:/이현석/포트폴리오/자바/테스트 1/book.txt");

                    int read1;
                    char[] cb1 = new char[100];

                    while ((read1 = fr1.read(cb1)) != -1) {
                        String data = new String(cb1, 0, read1);

                        System.out.println(data);

                    }

                    fr1.close();

                } catch (Exception e) {
                    System.out.println("저장된 도서가 없습니다.");
                }
                //Jdfilereader11196 배열을 만든 후 0에서 read 까지 읽기






            } else if (strNum.equals("3")) {
                System.out.println();
                System.out.println("[저장 및 종료되었습니다]");
                try{

                String original = "C:/이현석/포트폴리오/자바/테스트 1/book.txt";

                String target = "C:/이현석/포트폴리오/자바/테스트 1/file.txt";

                FileInputStream fis = new FileInputStream(original);
                FileOutputStream fos = new FileOutputStream(target);

                int read2;
                byte[] readNo = new byte[100];
                while ((read2 = fis.read(readNo)) != -1) {
                    fos.write(readNo, 0, read2);
                }
                fos.flush();

                fos.close();
                fis.close();
            } catch (Exception d) {
                System.out.println("저장할 도서가 없습니다.");
            }
            } else {
                System.out.println();
                System.out.println("없는 메뉴 입니다.");
            }
        }

    }

}
//숫자를 안쳤을때 반환값 
//저장이