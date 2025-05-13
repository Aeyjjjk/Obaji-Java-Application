import java.util.Scanner;

public class CaseState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display initial prompt
        System.out.println("Enter *131# to load Data: ");
        System.out.println("Enter *310# to Check Balance: ");
        System.out.println("Enter *303# to Borrow Data:\n ");

        // Read the user's initial input and trim any extra spaces
        String option = input.nextLine().trim();

        // Process the input using a switch statement
        switch (option) {
            case "*131#":
                // Display menu for *131#
                System.out.println("1. Buy Airtime\n2. Buy Data\n3. Gift Data\n4. Show Phone Number\n");
                int choice131 = input.nextInt();
                input.nextLine(); // Consume the newline character

                // Handle sub-options for *131#
                if (choice131 == 1) {
                    System.out.println("You selected Buy Airtime");
                } else if (choice131 == 2) {
                    System.out.println("You selected Buy Data");
                } else if (choice131 == 3) {
                    System.out.println("You selected Gift Data");
                } else if (choice131 == 4) {
                    System.out.println("You selected Show Phone Number");
                } else {
                    System.out.println("Invalid choice");
                }
                break;

            case "*310#":
                // Display menu for *310#
                System.out.println("Enter the number of your choice");
                System.out.println("1. Buy Airtime\n2. Buy Data\n3. Gift Data\n4. Show Phone Number\n");
                int choice310 = input.nextInt();
                input.nextLine(); // Consume the newline character

                // Handle sub-options for *310#
                if (choice310 == 1) {
                    System.out.println("You selected Buy Airtime");
                } else if (choice310 == 2) {
                    System.out.println("You selected Buy Data");
                } else if (choice310 == 3) {
                    System.out.println("You selected Gift Data");
                } else if (choice310 == 4) {
                    System.out.println("You selected Show Phone Number");
                } else {
                    System.out.println("Invalid choice");
                }
                break;

            case "*303#":
                // Display menu for *303# with borrowing options
                System.out.println("1. Borrow Airtime\n2. Borrow Data\n3. Check Borrowed Amount\n");
                int choice303 = input.nextInt();
                input.nextLine(); // Consume the newline character

                // Handle sub-options for *303#
                if (choice303 == 1) {
                    System.out.println("You selected Borrow Airtime");
                } else if (choice303 == 2) {
                    System.out.println("You selected Borrow Data");
                } else if (choice303 == 3) {
                    System.out.println("You selected Check Borrowed Amount");
                } else {
                    System.out.println("Invalid choice");
                }
                break;

            default:
                // Handle invalid initial input
                System.out.println("Invalid option");
                break;
        }

        input.close(); // Close the Scanner
    }
}