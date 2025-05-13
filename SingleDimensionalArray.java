public class SingleDimensionalArray{
	public static void main(String[] args){
	
	int[] num = {4,45,3,2,1};
	
	
	
	for(int i =0; i <5; i++){
			System.out.println(num[i]);

	}
	System.out.println("=====================================");
	
	for (int num1 : num){
		System.out.printf("%d%n",num1);/// the codes after the ==== are enhanced for loop


		

	}System.out.println("------------------------");
	
	
	String names[] = {"Mark","John","Mattew","Luke","Phillip"};
	for (String name : names){
		System.out.printf("%s%n",name);/// these codes after the ==== are enhanced for loop

	}
	}

}