import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

class Student implements Serializable{
    int id = 101;
    String name = "Bhavya";
}

public class SerialDemo{
    public static void main(String[] args) throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.obj"));
        out.writeObject(new Student());
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.obj"));
        Student s = (Student) in.readObject();
        System.out.println(s.name + " " + s.id);
        in.close();    
    }
}