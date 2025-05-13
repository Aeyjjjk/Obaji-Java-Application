public class InstanceMethodWithParameters{
	public static void main(String[] args) {
		InstanceMethodWithParameters imwp = new InstanceMethodWithParameters();
		int result = imwp.addition(50,17);
		System.out.printf("Total sum: %d%n",result);
		
	}
	public int  addition(int num1, int num2 ){
		
		int sum = num1 + num2;
		
		return sum;
		
	}
}// method is a piece of code that runs a specific task
// static method belongs to a class,that means u can call a static method without creating an instance of the class