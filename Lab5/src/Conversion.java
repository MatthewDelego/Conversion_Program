import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            char choice = scanner.next().charAt(0);

            if (choice == 'X' || choice == 'x') {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Validate user's choice
            if (choice < '1' || choice > '5') {
                System.out.println("Invalid choice. Please select a valid option.");
                continue; // Restart the loop if the choice is invalid
            }

            switch (choice) {
                case '1':
                    milesToKilometers(scanner);
                    break;
                case '2':
                    metersToInches(scanner);
                    break;
                case '3':
                    metersToFeet(scanner);
                    break;
                case '4':
                    fahrenheitToCelsius(scanner);
                    break;
                case '5':
                    fahrenheitToKelvin(scanner);
                    break;
            }
        }

        scanner.close(); // Close the main menu scanner
    }

    private static void displayMenu() {
        System.out.println("Welcome to the Conversion App!");
        System.out.println("Select an option:");
        System.out.println("1. Miles - Kilometers");
        System.out.println("2. Meters - Inches");
        System.out.println("3. Meters - Feet");
        System.out.println("4. Fahrenheit - Celsius");
        System.out.println("5. Fahrenheit - Kelvin");
        System.out.println("X. Exit");
    }

    private static void milesToKilometers(Scanner scanner) {
        while (true) {
            System.out.println("1. Miles to Kilometers");
            System.out.println("2. Kilometers to Miles");
            System.out.println("R. Return to main menu");
            char choice = scanner.next().charAt(0);

            // Return to the main menu option
            if (choice == 'R' || choice == 'r') {
                return; // Exit this method and return to the main menu
            }

            switch (choice) {
                case '1':
                    System.out.print("Enter distance in miles: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    double miles = scanner.nextDouble();
                    if (miles < 0) {
                        System.out.println("Invalid input. Distance cannot be negative.");
                        continue;
                    }
                    double kilometers = miles * 1.60934;
                    System.out.println(miles + " miles is equal to " + String.format("%.2f", kilometers) + " kilometers.");
                    break;

                case '2':
                    System.out.print("Enter distance in kilometers: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    kilometers = scanner.nextDouble();
                    if (kilometers < 0) {
                        System.out.println("Invalid input. Distance cannot be negative.");
                        continue;
                    }
                    miles = kilometers / 1.60934;
                    System.out.println(kilometers + " kilometers is equal to " + String.format("%.2f", miles) + " miles.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or R from the menu options.");
            }
        }
    }


    private static void metersToInches(Scanner scanner) {
        while (true) {
            System.out.println("1. Meters to Inches");
            System.out.println("2. Inches to Meters");
            System.out.println("R. Return to main menu");
            char choice = scanner.next().charAt(0);

            // Return to the main menu option
            if (choice == 'R' || choice == 'r') {
                return; // Exit this method and return to the main menu
            }

            switch (choice) {
                case '1':
                    System.out.print("Enter length in meters: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    double meters = scanner.nextDouble();
                    if (meters < 0) {
                        System.out.println("Invalid input. Length cannot be negative.");
                        continue;
                    }
                    double inches = meters * 39.3701;
                    System.out.println(meters + " meters is equal to " + String.format("%.2f", inches) + " inches.");
                    break;

                case '2':
                    System.out.print("Enter length in inches: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    inches = scanner.nextDouble();
                    if (inches < 0) {
                        System.out.println("Invalid input. Length cannot be negative.");
                        continue;
                    }
                    meters = inches / 39.3701;
                    System.out.println(inches + " inches is equal to " + String.format("%.2f", meters) + " meters.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or R from the menu options.");
            }
        }
    }


    private static void metersToFeet(Scanner scanner) {
        while (true) {
            System.out.println("1. Meters to Feet");
            System.out.println("2. Feet to Meters");
            System.out.println("R. Return to main menu");
            char choice = scanner.next().charAt(0);

            // Return to the main menu option
            if (choice == 'R' || choice == 'r') {
                return; // Exit this method and return to the main menu
            }

            switch (choice) {
                case '1':
                    System.out.print("Enter length in meters: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    double meters = scanner.nextDouble();
                    if (meters < 0) {
                        System.out.println("Invalid input. Length cannot be negative.");
                        continue;
                    }
                    double feet = meters * 3.28084;
                    System.out.println(meters + " meters is equal to " + String.format("%.2f", feet) + " feet.");
                    break;

                case '2':
                    System.out.print("Enter length in feet: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    feet = scanner.nextDouble();
                    if (feet < 0) {
                        System.out.println("Invalid input. Length cannot be negative.");
                        continue;
                    }
                    meters = feet / 3.28084;
                    System.out.println(feet + " feet is equal to " + String.format("%.2f", meters) + " meters.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or R from the menu options.");
            }
        }
    }



    private static void fahrenheitToCelsius(Scanner scanner) {
        while (true) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("R. Return to main menu");
            char choice = scanner.next().charAt(0);

            if (choice == 'R' || choice == 'r') {
                return; // Return to the main menu
            }

            switch (choice) {
                case '1':
                    System.out.print("Enter temperature in Fahrenheit: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    double fahrenheit = scanner.nextDouble();
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + String.format("%.2f", celsius) + " degrees Celsius.");
                    break;

                case '2':
                    System.out.print("Enter temperature in Celsius: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    celsius = scanner.nextDouble();
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + " degrees Celsius is equal to " + String.format("%.2f", fahrenheit) + " degrees Fahrenheit.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }



    private static void fahrenheitToKelvin(Scanner scanner) {
        while (true) {
            System.out.println("1. Fahrenheit to Kelvin");
            System.out.println("2. Kelvin to Fahrenheit");
            System.out.println("R. Return to main menu");
            char choice = scanner.next().charAt(0);

            if (choice == 'R' || choice == 'r') {
                return; // Return to the main menu
            }

            switch (choice) {
                case '1':
                    System.out.print("Enter temperature in Fahrenheit: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    double fahrenheit = scanner.nextDouble();
                    double kelvin = (fahrenheit + 459.67) * 5 / 9;
                    System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + String.format("%.2f", kelvin) + " Kelvin.");
                    break;

                case '2':
                    System.out.print("Enter temperature in Kelvin: ");
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); 
                        continue;
                    }
                    kelvin = scanner.nextDouble();
                    fahrenheit = (kelvin * 9 / 5) - 459.67;
                    System.out.println(kelvin + " Kelvin is equal to " + String.format("%.2f", fahrenheit) + " degrees Fahrenheit.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
