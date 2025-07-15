import java.io.File;

public class test {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        System.out.println("FIle exists " + file.exists());
        System.out.println("FIle exists " + file.isFile());
        System.out.println("FIle exists " + file.isDirectory());
    }
}
