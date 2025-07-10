// StringBuilder store = new StringBuilder();
// String []arr = password.split(" ");



import java.util.*;
public class Question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        try{
        boolean flag = false;
        for(int i = 0 ; i < password.length() ; i++){
            if(password.charAt(i) > '0' && password.charAt(i) < '9'){
                flag = true;
            }
        }

        if(!flag){
            throw new Exception("C");
        }
        if(password.length() < 5){
            throw new Exception("S");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }


}
//work made


// write a java code
// input - username, password
// password should be atleast have 5 characters if not then throw a exception as a char S
// if the password does not contain a digit then throw a exception as a char C


