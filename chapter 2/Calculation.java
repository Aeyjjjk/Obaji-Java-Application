//chapter 2, 2.15
import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int first = input.nextInt();
		System.out.print("Enter second integer: ");
		int second = input.nextInt();
		
		System.out.println("Sum: " + (first + second));
		System.out.println("Product: " + (first * second));
		System.out.println("Difference: " + (first - second));
		System.out.println("Quotient: " + (first / second));


//2.16
		if (first > second) {
			System.out.println(first + " is larger");}
		else if (second > first) {
			System.out.println(second + " is greater");}
		else {
			System.out.println("These numbers are equal");}			
		
			
		}
	
	}


