import java.util.*;
public class max {
    public static void main(String[]args){
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter 3 number saperated by space : ");
        int a = mk.nextInt();
        int b = mk.nextInt();
        int c = mk.nextInt();

        // int max = Math.max(a,Math.max(b,c));
        int max = Math.max(a,Math.max(b,c));

        System.out.println("The maximum number is "+max);

        mk.close();

    }
}
