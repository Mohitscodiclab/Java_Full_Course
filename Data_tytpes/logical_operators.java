public class logical_operators {
    public static void main(String[] args) {
        System.out.println("we are just combining the two rational operators....");
        System.out.println(1 != 2 && 1 < 2);        //true
        System.out.println(1 <= 2 && 5 >= 9);       //false
        System.out.println();
        System.out.println("Another Example");
        System.out.println("----------------");
            boolean isSunny = true;
            boolean isWarm = true;
        // AND Operator (&&)
        boolean isGooodBeachDay = isSunny && isWarm;
        System.out.println("Is it a good Beach Day ? \n" + isGooodBeachDay);
        System.out.println();
        
        //OR Operator (||)
        boolean isRaining = false;
        boolean isSnowing = true;
        boolean isBadWeather = isRaining || isSnowing ;
        System.out.println("Is the weather bad ? \n" + isBadWeather);
        System.out.println();

        //NOT Operator (!)
        boolean isHomeworkDone = false;
        boolean canPlayBGMI = !isHomeworkDone;
        System.out.println("Can I play BGMI/PUBG ? \n"+ canPlayBGMI);
        System.out.println();

        
        
    }
    
}
