//2.26

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        
        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
        input.close();
    }
}
