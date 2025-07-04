// abstract class abc{
//     abstract void display();
//     abstract void show();
// }

// public class first {
//     public static void main(String[] args) {
//         abc obj = new abc(){
//             public void display(){
//                 System.out.println("Hello from display");
//             }
//             public void show(){
//                 System.out.println("Hello from show");
//             }
//         };
//         obj.display();
//         obj.show();
//     }
// }

//functional interface only consist of single function


// @FunctionalInterface
// interface abc{
//      boolean display(int nm);

// }

// public class first {
//     public static void main(String[] args) {
//         abc obj = (num) -> 
//             num%2==0;
//             System.out.println(obj.display(20));
        
//     }
// }


//create the functional interface of operations having function that return arithmetic operations use the 
//lemda expression that calculate the sum of 2 numbers and product of two numbers 

// @FunctionalInterface
// interface calculatation{
//     int sum(int n , int m);
// }


// public class first{
//     public static void main(String[] args) {
//         calculatation obj = (num1 , num2) -> num1 + num2;
//         calculatation obj1 = (num1 , num2) -> num1 * num2;
//                     System.out.println(obj.sum(10,20));
//                     System.out.println(obj1.sum(10,20));
//     }
// }


//email validator interface checks the mail if its corrct or not corect


interface EmailValidator{
    boolean isValid(String email);
}

public class first{
    public static void main(String[] args) {
        EmailValidator validator = (String email) -> {
            return email.contains("@") && email.endsWith(".com");
        };
        System.out.println(validator.isValid("bhavyaisgmail.com"));
    }
}