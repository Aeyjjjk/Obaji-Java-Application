//2.32
import java.util.Scanner;

public class CountValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
        
        input.close();
    }
}
