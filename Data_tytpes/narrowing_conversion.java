public class narrowing_conversion {
    public static void main(String[] args) {
        System.out.println("Narrowing conversion example : ");
        System.out.println("-------------------------------");
        double doubleValue2 = 123.456;                 //bucket
        float floatValue2 = (float) doubleValue2;     // jug    // Narrowing conversion from double to float
        long longValue2 = (long) floatValue2;        //glass   // Narrowing conversion from float to long
        int intValue2 = (int) longValue2;           //cup     // Narrowing conversion from long to int

        System.out.println("double: " + doubleValue2);
        System.out.println("float: " + floatValue2);
        System.out.println();
        System.out.println("These always contain integral values so, the decimal part is removed.");
        System.out.println("long: " + longValue2);
        System.out.println("int: " + intValue2);
        System.out.println();
        
    }
    
}
