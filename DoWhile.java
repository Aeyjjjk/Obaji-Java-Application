import java.util.Scanner;


public class DoWhile {
	public static void main (String[] args) {
	
		int r =0;
		
		Scanner input = new Scanner(System.in);
		
			System.out.printf("Enter num: %n ");
			int num = input.nextInt();
			
			System.out.println("First 15 multiples  of " + num);


			for( r=1;r<=15;r++) {
				System.out.println(num * r);
				System.out.println(num + "x" + r + "=" + num * r);
				
		
		
	}
	
}
}