//2.35
import java.util.Scanner;

public class CarPoolSavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = input.nextDouble();
        
        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();
        
        System.out.print("Enter average miles per gallon: ");
        double mpg = input.nextDouble();
        
        System.out.print("Enter parking fees per day: ");
        double parkingFees = input.nextDouble();
        
        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();
        
        // Calculate fuel cost per day.
        double gallonsUsed = milesPerDay / mpg;
        double fuelCost = gallonsUsed * costPerGallon;
        
        double dailyCost = fuelCost + parkingFees + tolls;
        
        System.out.printf("Your daily driving cost is: $%.2f%n", dailyCost);
        
        input.close();
    }
}
