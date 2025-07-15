import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.*;

public class BufferedExample{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
        bw.write("Line 1\nLine 2");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String line;
        while((line = br.readLine()) !=  null){
            System.out.print(line);
        }
        br.close();
    }
}
