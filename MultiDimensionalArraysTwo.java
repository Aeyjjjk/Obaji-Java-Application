public class SumAndCountOfNumbers{
	
	public static void main(String[] args){
	int sum = 0;
	int odd=0;
	int even=0;
	int[][] numbers = {
	
	{32,34,53,12,56},
	{23,12,34,67,89},
	{12,32,43,62,58},
	{63,42,24,97,39}
	};
	
	for(int row = 0; row < 4; row++){
		for(int col = 0; col < 5; col++){
			
			if( numbers[row][col] % 2 == 0 ){
			sum += numbers[row][col];
				
			}
			else{
				odd++;
			}
			
		}
			
		
	}
	
	System.out.printf("The sum of all even numbers is %d%n",sum);
	System.out.printf("Total count of all odd number is %d%n",odd);
	//System.out.printf("%d%n",ages[3][2]);
	}
}