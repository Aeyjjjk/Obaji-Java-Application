public class StaticMethodWithParameters{
	public static void main(String[] args){
		int result = addition(50,17);
		System.out.printf("the total is: %d%n",result);
	}
	public static int addition(int num1, int num2){
		
		int sum = num1 + num2;
		return sum;
	}
}