//2.24

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest, smallest;

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        largest = num1;
        smallest = num1;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = input.nextInt();
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        input.close();
    }
}
