





import java.util.Scanner;


public class SelectNumber {
	public static void main(String[] args) {
		// chapter 2
		//2.5 and 2.6
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for x: ");
			int x = input.nextInt();
		System.out.print("Enter a value for y: ");
			int y = input.nextInt();
		System.out.print("Enter a value for z: ");
			int z = input.nextInt();

		
		//long _result = (x+y-z); //sum up the product 	Q2.5a
		
		System.out.printf("Product for x*y*z is: %d!%n",(x*y*z));
		
		input.close();
		
		
		
		int c = 7;
		
		if (c < 7)
			System.out.println("c is less than 7");
		
		else if (c >= 7)
			System.out.println("c is equal to or greater than 7");
		else
			System.out.print("Error! ");
	
	
	}
}		