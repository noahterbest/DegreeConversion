import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayMenu();
        int choice = getChoice();

        switch(choice){
            case 1:
                System.out.println("Decimal Degrees to Degrees, Minutes, Seconds");
                System.out.println(" ");

                System.out.println("Enter Decimal Degrees 0 - 180: ");
                double degrees = input.nextDouble();
                System.out.println(degrees);

                toDMS(degrees);

                break;
            case 2:
                System.out.println("Degrees, Minutes, Seconds to Decimal Degrees");
                System.out.println(" ");

                System.out.println("Enter Degrees: ");
                degrees = input.nextInt();
                System.out.println("Enter Minutes: ");
                double minutes = input.nextDouble();
                System.out.println("Enter Seconds: ");
                double seconds = input.nextDouble();
                System.out.println("Enter Direction (N/S/E/W): ");
                String direction = input.next();

                System.out.println(degrees + " " + minutes + " " + seconds + " " + direction);




                //toDecimalDegrees(degrees,minutes,seconds,direction);
                break;
            case 3:
                System.out.println("Exit");
                break;
        }

    }

    static void displayMenu() {
        System.out.println("This program converts between two GPS Coordinate Systems");
        System.out.println("1. Decimal Degrees to Degrees, Minutes, Seconds");
        System.out.println("2. Degrees, Minutes, Seconds to Decimal Degrees");
        System.out.println("3. Exit");
        System.out.println(" ");
    }

    static int getChoice() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        while (choice < 1 || choice > 3) {
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();
        }
        return choice;
    }

     static void toDMS(double degrees) {
        double minutes = (degrees - (int)degrees) * 60;
        double seconds = (minutes - (int)minutes) * 60;

        System.out.println((int)degrees + "° " + (int)minutes + "' " + seconds + "\" N or E");
    }

    static double toDecimalDegrees(int degrees, int minutes, int seconds, String direction) {
        return 0;
    }

    static void output() {

    }


}
