import java.util.*;
public class addition {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = mk.nextInt();
        System.out.println("Enter the second number :");
        int b = mk.nextInt();

        int sum = a+b;

        System.out.println("The addition of "+a+" and "+b+" is "+sum+".");
        
        mk.close();
    }
}