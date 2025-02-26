public class arithmeti_operators {
    public static void main(String[] args) {
        int a = 5 + 3;    // result is 8
        int b = 10 - 4;     // result is 6
        int c = 6 * 7;      // result is 42
        int d = 10 / 3;     // result is 3 (integral division)
        double e = 10.0 / 3.0; // result is 3.333......(floating point division)
        int f = 10 % 3;     // result is 1
        float g = 10 / 3.0f ;     // result is 3.3333..... (integral division)
        System.out.println(g);
        System.out.println();
        a += 5;     // a is now 13
        a -= 3;     // a is now 10
        a *= 2;     // a is now 20
        a /= 4;     // a is now 5
        a %= 4;     // a is now 1
        System.out.println(a);
        System.out.println();
        System.out.println("Increment operator");
        System.out.println("---------------------");
        a++;       // Post increment
        System.out.println(a);
        ++a;        //Pre increment
        System.out.println("Decrement operator");
        System.out.println("---------------------");
        a--;        //Post decrement
        --a;        //Pre decrement
        System.out.println(a);

    }
    
}
