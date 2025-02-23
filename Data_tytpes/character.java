public class character{
    public static void main (String[]args){

        char a = '!';
        char b = 'z';
        System.out.println("Character range:");
        System.out.println("-----------------");
        System.out.println(" Minimum Value :"+(int) Character.MIN_VALUE); // 0
        System.out.println(" Maximum Value :"+(int) Character.MAX_VALUE);  //65535
        //Common ASCII Exapmles (0-127 range)
        System.out.println();
        
        System.out.println("Some Examples are : ");
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println((char) 45); //Examples
        System.out.println((char) 24); //Examples
        System.out.println();
    }
}