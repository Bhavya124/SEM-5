import java.lang.reflect.Executable;
import java.util.*;
public class first {

    // static int display(int[] arr) throws ArithmeticException{
    //     return arr[6];
    // }



    public static void main(String[] args) {
        // int a = 5 , b = 0;
        // int arr[] = new int[4];
        // try{
        //     display(arr);
        // }catch (Exception e){
        //     System.out.println(e);
        // }
        // System.out.println("DONE");
   
        Scanner sc = new Scanner(System.in);

        try{
            int age = sc.nextInt();
            if(age < 0){
                throw new AgeException("AGE CAN NEVER BE NEGATIVE");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }    
}

class AgeException extends Exception{
    AgeException(String message){
        super(message);
    }
}

