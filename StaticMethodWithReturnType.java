public class StaticMethodWithReturnType{
	public static void main(String[] args){
		int result = addition();
		System.out.printf("the total is: %d%n",result);
	}
	public static int addition(){
		int num1 = 50;
		int num2 = 17;
		
		int sum = num1 + num2;
		return sum;
	}
}// static method with return type dosen't require u to create an object, but adds the int