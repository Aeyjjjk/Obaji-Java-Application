// chapter 2
// 2.1
//a = {}, b= if statement, c= // begins a comment, d= space,tab,newline are called white space
//e= Keywords are reserved for use by java, f=java begins execution at the 'main' method
//g= System.out.print,printf,println all displays information in a cmd

//2.2
//a= False, comments are ignored by the compiler and do not affect the program output.
//b= True, every variable in java must have a type.
//c= False, java is case sensitive, so the number and NuMbeR are different.
//d= False, the operator (%) can be used with both integer and floating points operands.
//e= False, *,/ and reminder operator(%) have higher prcedence than + and -

//2.3
import java.util.Scanner;

public class Math {
	public static void main(String[] args) {
		
		int c,thisIsAVariable,q76354,number;
		//int  = 34;
		//int  = 45;
		//int  = 79;
		//System.out.printf("C = %d%nGrade = %d%nAge = %d%nTotal = %d%n ",c,thisIsAVariable,q76354,number);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
			int choose = input.nextInt();
			//System.out.printf("You Entered %d%n",choose);
			//if (choose > 255)
				//System.out.printf("Error: Not an 'INTEGER', choose between 0-255");
			
		System.out.println("This is a Java program");
		
		System.out.printf("%s%n%s%n","This is a Java","program");
		//short a = 7;
			if (choose != 7)
				System.out.print("The variable number is not equal to 7\n");
			else
				System.out.print("It's equal 7");
			
		//2.8 a,b and c

		System.out.print("Enter an integer: \n");//a
		int b = 3;
		int d = 2;
		int a = b * d;	
			System.out.printf("Total: %d%n",a);	//b
			
		//this program performs a sample payroll calculation.//c
	}
}

//2.4
// identify and correct the errors
//a= if (c < 7); the ; is not meant to be there, correct way is: if (c < 7) 
//b= if (c => 7) the => is wrong, it should be >=

//2.9
//a= False, java operators are evaluated based on precedence, not strihtly left
// to right.
//b= True, all the listed name are valid.
//c= False, java follows operator precedence,*,/ comes before + and -.
//d= True, Variable name cannot start with a number, so the some listed names are 
// invalid.

//2.10 already done on Assume.java
//2.11
//a= p = i + j + k + 7. p here is modified it has a value
//b= System.out.println();. is not modified, it does have any value it only
//prints a message
//c= System.out.println("a = 5");. these prints the text but does not actually 
// assign 5 to a
//d= value = input.nextInt();. it is modified, it reads input from the user and
// assign it to 'value'.

//2.12
//these are the correct java stement for equation y=ax^3 + 7
//Ans: a,d and e are correct. while b,c and f have incorrect parenthesis placement

//2.13
//Order of Evaluation and result of x
//a= x=7+3*6/2-1;
//Ans: 3*6=18| 18/2=9| 7+9=16| 16-1=15. using bodmas
//b= 2%2+2*2-2/2;
//Ans: 2%2=0| 2*2=4| 2/2=1| 0+4=4| 4-1=3. using bodmas
//c= (3*9*(3+(9*3/(3))));
//Ans: innermost bracket should be solved first
//9*3=27| 27/3=9| 3+9=12| 3*9=27| 27*12=324. using bodmas