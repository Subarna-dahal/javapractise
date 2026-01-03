import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        //create a new file
        File ff = new File("input.txt");

//        try {
//            ff.createNewFile();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
        //write the  contains
//        FileWriter ffs=new FileWriter("input.txt");
//        try{
//            ffs.append("oe subarna");
//            ffs.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //reads the file
        try{
            Scanner sc=new Scanner(ff);
            while (sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
