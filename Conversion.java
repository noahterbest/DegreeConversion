import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayMenu();
        int choice = getChoice();
    }

    static void displayMenu() {
        //Displays the menu

        System.out.println("This program converts between two GPS Coordinate Systems");
        System.out.println("1. Decimal Degrees to Degrees, Minutes, Seconds");
        System.out.println("2. Degrees, Minutes, Seconds to Decimal Degrees");
        System.out.println("3. Exit");
        System.out.println(" ");
    }

    static int getChoice() {
        //Gets the user's choice

        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        }

        switch(choice){
            case 1:
                System.out.println(toDMS());

                System.out.println(" ");
                System.out.println("Would you like to convert another decimal degree? (y/n)");
                String answer = input.next();
                if(answer.equals("y") || answer.equals("Y")){
                    displayMenu();
                    getChoice();
                }
                break;
            case 2:
                toDD();

                System.out.println(" ");
                System.out.println("Would you like to convert another decimal degree? (y/n)");
                answer = input.next();
                if(answer.equals("y") || answer.equals("Y")){
                    displayMenu();
                    getChoice();
                }
                break;
            case 3:
                System.out.println("Exit");
                break;
        }

        return choice;
    }

     static String toDMS() {
        Scanner input = new Scanner(System.in);
        //Converts decimal degrees to degrees, minutes, seconds
        System.out.println("Decimal Degrees to Degrees, Minutes, Seconds");
        System.out.println(" ");

        //Checks if the degrees is valid
        System.out.println("Enter Decimal Degrees 0 - 180: ");
        double degrees = input.nextDouble();
        while(degrees < 0 || degrees > 180){
            degrees = input.nextDouble();
        }

        double minutes = (degrees - (int)degrees) * 60;
        double seconds = (minutes - (int)minutes) * 60;
        String output = (int)degrees + "° " + (int)minutes + "' " + seconds + "\" N or E";
        return output;
    }

    static void toDD() {
        Scanner input = new Scanner(System.in);
        //Converts degrees, minutes, seconds to decimal degrees
        System.out.println("Degrees, Minutes, Seconds to Decimal Degrees");
        System.out.println(" ");

        //Checks if the degrees is valid
        System.out.println("Enter Degrees 0 - 180: ");
        double degrees = input.nextDouble();
        while(degrees < 0 || degrees > 180){
            System.out.println("Enter Degrees 0 - 180: ");
            degrees = input.nextDouble();
        }

        //Checks if the minutes is valid
        System.out.println("Enter Minutes 0 - 60: ");
        double minutes = input.nextDouble();
        while(minutes < 0 || minutes > 60){
            System.out.println("Enter minutes 0 - 60: ");
            minutes = input.nextDouble();
        }

        //Checks if the seconds is valid
        System.out.println("Enter Seconds 0 - 60: ");
        double seconds = input.nextDouble();
        while(seconds < 0 || seconds > 60){
            System.out.println("Enter seconds 0 - 60: ");
            seconds = input.nextDouble();
        }

        //Checks if the direction is valid
        System.out.println("Enter Direction (N/S/E/W): ");
        String direction = input.next();
        if (direction != "N" && direction != "S" && direction!= "E" && direction != "W"){
            System.out.println("Enter Direction (N/S/E/W): ");
            direction = input.next();
        }
        System.out.println(degrees + " " + minutes + " " + seconds + " " + direction);
        System.out.println(" ");

        //Conversion
        degrees = degrees + (minutes / 60) + (seconds / 3600);
        System.out.println("Decimal Degrees: " + degrees);

    }
}
