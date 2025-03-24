//2.17

import java.util.Scanner;

public class ArithmeticStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        int sum = a + b + c;
        int average = sum / 3;  // integer division
        int product = a * b * c;
        
        // Determine smallest and largest
        int smallest = a;
        if (b < smallest) { smallest = b; }
        if (c < smallest) { smallest = c; }
        
        int largest = a;
        if (b > largest) { largest = b; }
        if (c > largest) { largest = c; }

        System.out.println("Sum: " + sum);
        System.out.println("Average (integer): " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        
        input.close();
    }
}
