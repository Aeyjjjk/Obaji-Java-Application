import java.util.Scanner;

public class Accept10Numbers { public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);

		int sum6to9 = 0;
		int sum4to10 = 0;
		int differnce;
	
    for (int i = 0; i < 10; i++) {
		System.out.printf("Enter num%d: ",i);
        int num = input.nextInt();
        if (i >= 6 && i <= 9)
			sum6to9 += num;
        if (i >= 3 && i <= 10)
			sum4to10 += num;
    }
	
	String n = "we ";
	n += " were";
	n += " wer";
	n += " wee";
	    System.out.println(n);

    differnce = sum4to10 -sum6to9;

    System.out.printf("4 to 10: %d%n", sum4to10);
    System.out.printf("6 to 9: %d%n", sum6to9);
    System.out.printf("Difference: %d ", differnce);
}

}
