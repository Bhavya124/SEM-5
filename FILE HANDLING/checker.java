import java.io.FileWriter;
import java.io.FileReader;

public class checker {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("abc.txt");
        writer.write("Hello, World");
        writer.close();
        FileReader reader = new FileReader("abc.txt");
        int ch;
        while((ch = reader.read()) != -1){
            System.out.print((char) ch);
        }
    }
}
