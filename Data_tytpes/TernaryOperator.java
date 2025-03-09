public class TernaryOperator {

    public static void main(String[] args) {
        
        //result = (condotion) ? valuefTrue : valuefFalse;

        int a = 5;
        int b = 10;
        boolean isEven =  b % 2 == 0 ? true : false;
        String str =  a % 2 == 0 ? "Even" : "Odd";

        System.out.println(isEven); // Output : true
        System.out.println(str); // Output : Odd
    }
}