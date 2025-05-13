import java.util.Scanner;
public class SentineLoop{
	public static void main(String[] args){
	
		long sum =0;
		double average;
		int product = 1;
	
		int counter = 0;
	while(true){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		System.out.println("Enter -1 to quit: ");
		int num = input.nextInt();
		
		if(num == -1){
			break;
			}
			counter++;
			sum += num;
			product *= num;
			

			}

			
			average = sum/counter;
			System.out.printf("Sum: %d%n",sum);
			System.out.printf("Product: %d%n",product);
			System.out.printf("The Average: %f%n",average);
	

	}}