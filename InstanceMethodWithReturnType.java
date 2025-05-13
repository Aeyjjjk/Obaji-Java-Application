public class InstanceMethodWithReturnType{
	public static void main(String[] args) {
		InstanceMethodWithReturnType imwrt = new InstanceMethodWithReturnType();
		int result = imwrt.addition();
		System.out.printf("Total sum: %d%n",result);
		
	}
	public int  addition(){
		int num1 = 12;
		int num2 = 15;
		
		int sum = num1 + num2;
		
		return sum;
		
	}
