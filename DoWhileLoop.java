import java.util.Scanner;


public class DoWhileLoop {
	public static void main (String[] args) {
	
		int r =0;
		int positive = 0;
		int negative = 0;
		int zero = 0;
		Scanner input = new Scanner(System.in);
		
		for(r=1; r<=10; r++) {
			System.out.printf("Enter num%d: ",r);
			int num = input.nextInt();
		
		if(num < 0){
			negative++;
		}
		else if(num > 0){
			positive++;
		}
		else {
			zero++;
			}
		}	
			System.out.printf("Out of Ten counts you choose positive times%d%n ",positive);
			System.out.printf("Out of Ten counts you choose zero times%d%n ",zero);
			System.out.printf("Out of Ten counts you choose negative times%d%n ",negative);
		
		//do {
		//	System.out.println("Hi");
		//	i++;
		
		//while(i<=10);
	}		
		
	}
