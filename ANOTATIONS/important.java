import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Myanno{
    int values() default 0;
    String name() default "Chitkara";
}

@Myanno(values = 9000)
class demo{}

public class important {
    public static void main(String[] args) {
        demo dm = new demo();
        Class c = dm.getClass();
        System.out.println(c.getName());
        Myanno ann = (Myanno) c.getAnnotation(Myanno.class);
        System.out.println(ann.values());
        System.out.println(ann.name());
        
        
    }
}


//single value to single notation varna multiple notation