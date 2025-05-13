public class If {
	public static void main(String[] args) {
	
		byte age = 10;
		if (age >= 18)
				{
			System.out.printf("Your age is %d. You are an Adult",age);
		} else if (age <= 17) {
			System.out.printf("You age is %dyears. You are not an Adult",age);

		}
	}
}