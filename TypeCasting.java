public class TypeCasting{
	public static void main(String[] args) {
		
		//widening
		double balance = 434345;
		System.out.printf("Your account balance is %c%f%n",'$',balance);
		
		
		//narrowing 
		char alpha = '?';
		
		int asciiCode = alpha;
		System.out.printf("The ASCIICODE for ? is %d%n",asciiCode);
		
		double height = 5.8;
		short myHeight = (short)height;
		System.out.printf("My faculty height is %d%n",myHeight);
		
		
		
	}
}