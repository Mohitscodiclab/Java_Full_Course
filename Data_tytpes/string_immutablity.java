public class string_immutablity {
    public static void main(String[] args) {
        // jvm --> heap memory (string pool)
        String a = "hello";
        System.out.println();
        String b = a.toUpperCase();
        System.out.println(a);
        System.out.println(b);
        System.out.println("===============");
        String m = "world";
         m = m.toUpperCase();   //reassigning the same variable
        System.out.println(m);
        
        
    }
    
}
