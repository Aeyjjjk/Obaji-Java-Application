//2.33
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Conversion factor for BMI in imperial units
        final double CONVERSION_FACTOR = 703.0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        double bmi = (weight / (height * height)) * CONVERSION_FACTOR;
        System.out.printf("Your BMI is: %.2f%n", bmi);
        
        // Display reference info (for example, from NIH)
        System.out.println("BMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal weight: 18.5 – 24.9");
        System.out.println("Overweight: 25 – 29.9");
        System.out.println("Obesity: 30 or greater");
        
        input.close();
    }
}
