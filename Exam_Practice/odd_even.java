import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = mk.nextInt();

        if (a % 2 == 0) {
            System.out.println("This is even number.");
        } else {
            System.out.println("this is odd number.");
        }

        mk.close();
    }
}
