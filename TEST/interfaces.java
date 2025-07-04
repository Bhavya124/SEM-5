//interface me jo likh do ge use change nhi kar sakte use uske andr hi overwrite kr sakte hain
import java.util.*;

interface abc{
    public int a  = 10;
    void display();
}

interface def{
    void abc1();
}

class B implements abc,def{
    public void display(){
        System.out.println("Calling from the class B");
    }

    public void abc1(){
        System.out.println("Calling from the class B");
    }
}

public class interfaces {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
