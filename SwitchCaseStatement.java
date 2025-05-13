import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To subscribe Data");
		System.out.println("Enter *310# To check Balanc");
		System.out.println("Enter *606# To Borrow Data");
		System.out.println("");
		
		System.out.print("Enter code: ");
		String code = input.nextLine();
			
		switch(code){
			case "*131#":
			{    
			    System.out.println("");
				System.out.println("Enter 1 for 1 month subscription");
				System.out.println("Enter 2 for 2 months subscription");
				System.out.println("Enter 3 for 3 months subscription");
				System.out.println("Enter 4 for 4 months subscription");
		        System.out.println("");
				
				System.out.print("Enter code: ");
				int option = input.nextInt();
				
				switch(option){
					case 1->System.out.println("Your 1 month subscription has been activated");
					
					case 2-> System.out.println("Your 2 month subscription has been activated");
					
					case 3->System.out.println("Your 3 month subscription has been activated");
	
					case 4->System.out.println("Your 4 month subscription has been activated");
					default->System.out.println("Invalid input");
					//// -> automatically adds break to make the code simple and readable
				}
			}
			break;
			
			case "310#":
			{
				System.out.println("Your Balance is: N8950.54");
			}
			break;
			
			case "*606#":
   			{   
			    System.out.println("");
				System.out.println("Enter 1 to borrow 1000");
				System.out.println("Enter 2 to borrow 2500");
				System.out.println("Enter 3 to borrow 4500");
				System.out.println("Enter 4 to borrow 7000");
		        System.out.println("");
				
				System.out.print("Enter code: ");
				int option = input.nextInt();
				switch(option){
					case 1:
					{
						System.out.println("Your account has been credited with 1000");
					}
					break;
					
					case 2: 
					{
						System.out.println("Your account has been credited with 2500");
					}
					break;
					
					case 3:
					{
						System.out.println("Your account has been credited with 4500");
					}
					break;
					
					case 4:
					{
						System.out.println("Your account has been credited with 7000");
					}
					break;
					
					default:
					System.out.println("Invalid input");
				}
			}
			}
			//break;
			//default:
				//System.out.println("Invalid Input");
		}
	}
