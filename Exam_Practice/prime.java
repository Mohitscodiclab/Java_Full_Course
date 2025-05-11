import java.util.*;
public class prime {
    public static void main(String[]args){
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = mk.nextInt();

        boolean isPrime = true;

        if(a<=1){
            isPrime = false;
        }else{
            for(int i = 2;i <= a/2;i++){
                if(a%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("The "+a+" is prime number.");
        }else{
            System.out.println("The "+a+" is not prime number.");
        }
        mk.close();
    }
}
