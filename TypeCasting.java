public class TypeCasting{
	public static void main(String[] args) {
		
		//widening
		double balance = 434345;
		System.out.printf("Your account balance is %c%f%n",'$',balance);
		
		
		//narrowing 
		char alpha = '2';
		
		byte asciiCode1 = (byte)alpha;
		int asciiCode2 = alpha;
		long asciiCode3 = (long)alpha;
		System.out.printf("The ASCIICODE1 for %c is %d%n",alpha,asciiCode1);
		System.out.printf("The ASCIICODE2 for %c is %d%n",alpha,asciiCode2);
		System.out.printf("The ASCIICODE3 for %c is %d%n",alpha,asciiCode3);
		System.out.println(alpha);
		
		double height = 5.8;
		short myHeight = (short)height;
		System.out.printf("My faculty height is %d%n",myHeight);
		
		
		
	}
}