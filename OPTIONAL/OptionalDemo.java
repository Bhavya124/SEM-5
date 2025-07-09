import java.util.Optional;

public class OptionalDemo{
    public static void main(String[] args) {
        Optional<String> result  = getName();

        result.ifPresentOrElse(
            v -> System.out.println(v.toUpperCase()),
            () -> System.out.println("No value found")
        );
        // if(result != null){
        //     System.out.println(result);
        // }
        // else{
        //     System.out.println("Null Value");
        // }
        //Optional<String> name = Optional.of("Chitkara");
        //name.ifPresent(n -> System.out.println("Hello, " + n));
    }
    public static Optional<String> getName(){
        return Optional.empty();    
    }
}

