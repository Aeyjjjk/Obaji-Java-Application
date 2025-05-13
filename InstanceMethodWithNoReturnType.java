public class InstanceMethodWithNoReturnType{
	public static void main(String[] args) {
		InstanceMethodWithNoReturnType imwnrt = new InstanceMethodWithNoReturnType();
		imwnrt.addition(); 
		
	}
	public void addition(){
		int num1 = 12;
		int num2 = 15;
		
		int sum = num1 + num2;
		System.out.printf("Total sum: %d%n",sum);
		
		
	}
}