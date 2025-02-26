public class bitwise_operator {
    public static void main(String[] args) {
        int a = 5;  //0101
        int b = 8;  //1000
                    //0000
        // AND Operator (&)
        System.out.println("AND Operator:");
        System.out.println("--------------");
        System.out.println("5 & 3 = " + (a & b));
        System.out.println("Binary : " + Integer.toBinaryString(a & b));
        System.out.println();
        
        // OR Operator (|)
        System.out.println("OR Operator:");
        System.out.println("--------------");
        System.out.println("5 | 3 = " + (a | b));
        System.out.println("Binary : " + Integer.toBinaryString(a | b));
        System.out.println();

        // XOR Operator (^)
        System.out.println("XOR Operator:");
        System.out.println("--------------");
        System.out.println("5 ^ 3 = " + (a ^ b));
        System.out.println("Binary : " + Integer.toBinaryString(a ^ b));
        System.out.println();

        // NOT Operator (~)
        System.out.println("NOT Operator:");
        System.out.println("--------------");
        System.out.println("~5 = " + (~a));
        System.out.println("Binary : " + Integer.toBinaryString(~a));
        //101 + 1
        System.out.println();

        // Left Shift (<<)
        System.out.println("Left Shift");
        System.out.println("--------------");
        System.out.println("5 << 1 = " + (a << 1));
        System.out.println("Binary : " + Integer.toBinaryString(a << 1));
        System.out.println();
        
        // Right Shift (>>)
        System.out.println("Right Shift");
        System.out.println("--------------");
        System.out.println("5 >> 1 = " + (a >> 1));
        System.out.println("Binary : " + Integer.toBinaryString(a >> 1));
        System.out.println();
    }
    
}
