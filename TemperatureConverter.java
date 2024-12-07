import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying  the menu options the user can choose from to convert
        System.out.println(" 🌡️ Temperature Converter");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit 🌡️ ");
        System.out.println("2. Convert Fahrenheit to Celsius 🌡️ ");

        try {
            // Reading the users choice
            int choice = scanner.nextInt();

            //  About to performing the conversion based on the user's choice
            if (choice == 1) {
                // Convert Celsius to Fahrenheit if user chose 1, using the Celsius to Fahrenheit covevertion
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                if (celsius < -273.15) {
                    System.out.println(" ❌ Invalid input: Temperature cannot be below absolute zero (-273.15°C).");
                } else {
                    double fahrenheit = (celsius * 9/5) + 32;
                    // Print out the results
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    if(celsius < 8){
                        System.out.println("Low Temperature 🥶❄️ ");
                    }else if(celsius > 30){
                        System.out.println("High Temperature 🥵🔥");
                    }
                }
            } else if (choice == 2) {
                // Convert Fahrenheit to Celsius if the user chose 2, using the Fahrenheit to Celsius convertion
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                if (fahrenheit < -459.67) {
                    System.out.println("❌Invalid input: Temperature cannot be below absolute zero (-459.67°F).");
                } else {
                    double celsius = (fahrenheit - 32) * 5/9;
                    //Results from Fahrenheit to Celsius
                    System.out.println("Temperature in Celsius: " + celsius);
                    if(fahrenheit < 47) {
                        System.out.println("Low Temperature 🥶❄️ ");
                    }else if (fahrenheit > 90){
                        System.out.println("High Temperature 🥵🔥 ");
                    }
                }
            } else {
                // Handle invalid choice the user makes
                System.out.println(" ❌ Invalid choice. Please enter 1 or 2.");
            }
        } catch (InputMismatchException e) {
            // Handle invalid input the user makes
            System.out.println(" ❌ Invalid input: Please enter a valid number.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

