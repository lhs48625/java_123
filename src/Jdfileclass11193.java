import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Jdfileclass11193 {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Temp/Dir");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");
        // 내부에 각 파일이 없으면 새로 생성해서 만들어줌

        if (dir.exists() == false) { dir.mkdirs();} 
        //mkdirs 경로상에 없는 모든 디렉토리생성
        if (file1.exists() == false) {file1.createNewFile();}
        if (file2.exists() == false) { file2.createNewFile();}
        if (file3.exists() == false) { file3.createNewFile();}
        //exists는 파일이나 디렉토리가 있는지 확인함

        File temp = new File("C:/Temp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a  HH:mm");
        File[] contents = temp.listFiles();
        System.out.println("날짜               시간            형태      크기      이름");
        System.out.println("---------------------------------------------------------------------------------");
        for(File file : contents) {
            System.out.println(sdf.format(new Date(file.lastModified())));
         if(file.isDirectory()) {
            System.out.println("\t<DIR>\t\t\t" + file.getName());
        }
        else {
            System.out.println("\t\t\t" + file.length() + "\t" + file.getName());

          }
          System.out.println();
        }
    }
}
