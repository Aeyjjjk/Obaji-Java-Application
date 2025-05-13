public class StaticMethodWithNoReturnType{
	public static void main(String[] args){
		addition();
	}
	public static void addition(){
		int num1 = 50;
		int num2 = 17;
		
		int sum = num1 + num2;
		System.out.printf("The sum is: %d%n",sum);
	}
}// static method with no return type dosen't require u to create an object