public class MultiDimensionalArrays{
	
	public static void main(String[] args){
	
	int[][] numbers = {
	
	{32,34,53,12,56},
	{23,12,34,67,89},
	{12,32,43,62,58},
	{63,42,24,97,39}
	};
	int sum = 0;
	
	int secondSum = 0;
	
	for(int row = 0; row < 4; row++){
		for(int col = 0; col < 5; col++){
			
			sum += numbers[row][col];
		}
			
		
	}
	
	System.out.printf("The sum of all the numbers is %d%n",sum);
	System.out.println("=====================================");
	for(int rows[] : numbers){
		for(int nums : rows){
			secondSum += nums;
		}
	}

		System.out.printf("The sum of all the numbers is %d%n",secondSum);
	}
}