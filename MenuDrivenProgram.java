import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Keep displaying the menu until the user chooses to exit
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");

            // Validate user input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 3.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            // Process the user's choice
            if (!handleMenuChoice(choice, scanner)) {
                break; // Exit the loop if the user chooses option 3
            }
        }

        scanner.close(); // Close scanner before exiting
    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle menu choices
    public static boolean handleMenuChoice(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd(scanner);
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                return false; // End the program
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");
        }
        return true; // Continue running the program
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");

        // Validate user input
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.nextLine(); // Clear invalid input
        }
    }
}
