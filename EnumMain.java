public class EnumMain{
	public static void main(String[] args){
	    AccountType type = AccountType.SAVINGS;
		
		switch(type) {
			case SAVINGS: 
			{
			System.out.println("Savings");
			}
			break;
			case CHECKING:
			{
			System.out.println("Checking");
			}
			break;
			case FIXED_DEPOSIT:
			{
			System.out.println("Fixed deposit");
			}
			break;
		
		}
	}
}