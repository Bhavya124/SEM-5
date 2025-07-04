import java.util.*;

abstract class abc{
    public int a = 10;
    public void display(){
        System.out.println(a);
    }
    abstract void show();
}

class B extends abc{
    @Override
    void show(){
        System.out.println("Class B");
    }
}

public class abstraction {
    public static void main(String[] args) {
        abc obj = new B();
        obj.show();
    }
}
