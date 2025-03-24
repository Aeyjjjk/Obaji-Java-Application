//2.34
import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the current world population: ");
        long currentPopulation = input.nextLong();
        
        System.out.print("Enter the annual growth rate (in percentage, e.g., 1.2): ");
        double growthRatePercent = input.nextDouble();
        double growthRate = growthRatePercent / 100;
        
        System.out.println("Estimated World Population:");
        for (int year = 1; year <= 5; year++) {
            // New population = currentPopulation * (1 + growthRate)^year
            long estimatedPopulation = (long)(currentPopulation * Math.pow((1 + growthRate), year));
            System.out.println("After " + year + " year(s): " + estimatedPopulation);
        }
        
        input.close();
    }
}
