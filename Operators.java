public class Operators{
	public static void main(String[] args) {
	
		//Assigment operator(=)
		
		int num1 = 13;
		int num2 = 5;
		
		//Arithmetic operators(+,*,-,/,%) are used to perform basic mathematics operation
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int difference = num1 - num2;
		double quotient =(double)num1 / num2;
		int remainder = num1 % num2;
		System.out.printf("The sum of the numbers is %d%n",sum);
		System.out.printf("The product of the numbers is %d%n",product);
		System.out.printf("The difference of the numbers %d and %d is %d%n",num1,num2,difference);
		System.out.printf("The quotient of the numbers is %f%n",quotient);
		System.out.printf("The remainder of the numbers is %d%n",remainder);
		System.out.println("=============================================");
		
		//Relational operator(>,<,>=,<=,==,!=) used for data comparism
		
		boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterThanOrEqualTo = num1 >= num2;
		boolean isLessThanOrEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean isNotEqualTo = num1 != num2;
		System.out.printf("Is %d < %d? %b%n",num1,num2,isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printf("Is %d >= %d? %b%n",num1,num2,isGreaterThanOrEqualTo);
		System.out.printf("Is %d <= %d? %b%n",num1,num2,isLessThanOrEqualTo);
		System.out.printf("Is %d == %d? %b%n",num1,num2,isEqualTo);
		System.out.printf("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
		System.out.println("===============================================");
		
		//Logical operators(&&=NOT, ||=OR, ! is Not) are used for making decision
		
		boolean isAndOperator = num1 > num2 && num1 >= num2;
		boolean isOrOperator = num1 == num2 || num1 > num2;
		boolean isNotOperator = !(num1 == num2 || num1 > num2); //the ! change what in the bracket to the opposite
		System.out.printf("Is %d > %d && %d >= %d? %b%n",num1,num2,num1,num2,isAndOperator);
		System.out.printf("Is %d == %d || %d > %d? %b%n",num1,num2,num1,num2,isAndOperator);
		System.out.printf("Is !(%d == %d || %d > %d)? %b%n",num1,num2,num1,num2,isNotOperator);

	}
}