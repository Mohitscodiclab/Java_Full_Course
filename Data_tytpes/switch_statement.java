import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.println("Enter a number (1-7) for the day of the week: ");
        int day = d.nextInt();
        String dayName;

        // if (day == 1) {
        //     dayName = "Monday";
        // } else if (day == 2) {
        //     dayName = "Tuesday";
        // } else if (day == 3) {
        //     dayName = "Wednesday";
        // } else if (day == 4) {
        //     dayName = "Thursday";
        // } else if (day == 5) {
        //     dayName = "Friday";
        // } else if (day == 6) {
        //     dayName = "Saturday";
        // } else if (day == 7) {
        //     dayName = "Sunday";
        // } else {
        //     dayName = "Invalid Day Entered";
        // }

    // converting to Sitch statemnet to efficient approach
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thrusday";
                break;
            case 5:
            dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7: 
                dayName = " Sunday";
                break;
            default:
            dayName = "Invalid day entered";
            
        }

        System.out.println("Day: " + dayName); 

        d.close();
    }
}
