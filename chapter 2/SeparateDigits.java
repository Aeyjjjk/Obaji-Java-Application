//2.30
import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = input.nextInt();
        
        // Extract digits using division and modulus
        int digit1 = number / 10000;           // first digit
        int digit2 = (number / 1000) % 10;       // second digit
        int digit3 = (number / 100) % 10;        // third digit
        int digit4 = (number / 10) % 10;         // fourth digit
        int digit5 = number % 10;                // fifth digit
        
        System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
        input.close();
    }
}
