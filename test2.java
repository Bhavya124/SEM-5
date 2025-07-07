import java.util.Scanner;

import calculator.cal;

public class test2 {
    public static void main(String[] args) {
        cal obj = new cal();
        Scanner sc = new Scanner(System.in);
        char i = sc.next().charAt(0);
        int n = sc.nextInt(); 
        int m = sc.nextInt();

        switch (i) {
            case '+':
                System.out.println(obj.add(n, m));
                break;
            case '-':
                System.out.println(obj.sub(n, m));
                break;
            case '*':
                System.out.println(obj.mul(n, m));
                break;
            case '/':
                System.out.println(obj.div(n, m));
                break;
        
            default:
                break;
        }
        
        
    }
}
