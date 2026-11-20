import java.io.FileReader;

public class LibraryMain {
    public static void main(String[] args) throws Exception{
        

        FileReader fr = new FileReader("C:/이현석/포트폴리오/자바/test/books.txt");

        int read;
        char[] cb = new char[250];

        while ((read = fr.read(cb)) != -1) {
            String data = new String(cb, 0, read);

            System.out.println(data);

        }
        boolean run = true;
        while (run) {
            System.out.println();
            System.out.println("===LIBRARY SYSTEM===");
            System.out.println("1. 도서등록 | 2. 목록조회 | 3. 저장 및 종료");
            System.out.print("메뉴 선택 >>");


        Manageable bok;
        bok = new BookManager();

        bok.addItem(null);
        bok.displayAll();
        bok.saveToFile();
        bok.loadFromFile();
        
            
        


        
            
        
    }
}
}
