import java.util.Scanner;
public class BankingApp{
		String accountName = "Peter Obi";
		String accountNumber = "264783948499";
		double accountBalance = 238332.98;// search local variable
									//check sentinel controlled repetition
									//math class method
		
		public  double deposit(int amount) {
			accountBalance += amount;
			return accountBalance;
		}
		public  double withdrawal(int amount) {
			
			if (amount > accountBalance) {
				System.out.println("Insufficient funds");
			}else {
				accountBalance -= amount;
				}
			return accountBalance;
		}
		public  double checkBalance() {
			
			return accountBalance;
		}
		
		public static void main(String[] args){
			BankingApp bankapp = new BankingApp();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Welcome to UBA");
			System.out.println("Enter 1 To Deposit");
			System.out.println("Enter 2 To Withdrawl");
			System.out.println("Enter 3 To CheckBalance");
			System.out.println();
			System.out.println("Enter Your choice");
			
			int choice = input.nextInt();
			System.out.println();

			switch(choice){
				case 1: {
					System.out.print("Enter Amount to deposit: ");
					int depositAmount = input.nextInt();
					
					
					System.out.println("==========================");

					System.out.println("Account Name: " + bankapp.accountName);
					System.out.println("Account Number: " + bankapp.accountNumber);
					System.out.printf("Initial Balance: %c%.2f%n" , '$' , bankapp.accountBalance);
					
					
					bankapp.deposit(depositAmount);
					System.out.printf("Your total Balance is: %c%.2f%n",'$', bankapp.checkBalance());
					
					System.out.println("==========================");

					
				}break;
				
				case 2: {
					System.out.print("Enter Amount to withdraw: ");
					int withdrawAmount = input.nextInt();
					
					
					System.out.println("==========================");

					System.out.println("Account Name: " + bankapp.accountName);
					System.out.println("Account Number: " + bankapp.accountNumber);
					System.out.printf("Initial Balance: %c%.2f%n" , '$' , bankapp.accountBalance);
					
					
					bankapp.withdrawal(withdrawAmount);
					//System.out.printf("Your total Balance is: %c%.2f%n", '$',bankapp.checkBalance());
					
					System.out.println("==========================");
				}break;
				
				case 3: {
					
					
					System.out.println("==========================");

					System.out.println("Account Name: " + bankapp.accountName);
					System.out.println("Account Number: " + bankapp.accountNumber);
					System.out.printf("Initial Balance: %c%.2f%n" , '$' , bankapp.accountBalance);
					
					
					bankapp.checkBalance();
					System.out.printf("Your total Balance is: %c%.2f%n",'$', bankapp.checkBalance());
					
					System.out.println("==========================");

				}break;
				
				default: 
					System.out.println("Invalid Input");
			}
		}
		
		
}