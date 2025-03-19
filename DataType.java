public class DataType{
	public static void main(String[] args) {
	  // integer typr byte,long,int,short
	  
		byte age = 50;  // holds max 255. 
		System.out.printf("Your age is %d%n",age);
		
		short quantity = 10000; //holds max -32767 to +32767
		System.out.printf("I bought %d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 3000000; // max 2b
		System.out.printf("The total population of Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L; // max 10000..... add L =long for int to recongnize it as long
		System.out.printf("The worlds population is %d people%n",worldPopulation);
		
		float myBalance = 2380.83920F; //F=float
		System.out.printf("Your account balance is $%f%n",myBalance);
		
		double cbnReserve = 6667273.445542423;
		System.out.printf("The CBN balance is %.5f%n",cbnReserve);
		
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b%n",isJavaFun);
		
		char alpha = '@'; //character type- char
		System.out.printf("My email is mailooo%cgmail.com",alpha);
		
		
		
	  
	}
}