import java.util.Scanner;


public class UserInput{
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in); //CHECK 57 KEYWORD
			System.out.print("What's your name?: ");
			String name = input.nextLine(); // string used for name
			
			System.out.print("What's your address: ");
			String address = input.nextLine(); //string used for name
			
			System.out.print("How old are you: ");
			byte age = input.nextByte(); // byte used for age 
			// try using double,int,char,long,short
			
			System.out.println();
			
			System.out.printf("Hello %s, you are welcome to First Bank%n",name);
			System.out.printf("You are living in %s ",address);
			System.out.printf("and You are %d years old ",age);
		
	
	
	}
}	