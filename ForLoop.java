public class ForLoop{
	public static void main(String[] args){
	
	//for loop is used when one knows the times the code should run. 
	//like stop when the program reaches 500. it has  3 componenets
	//initialization,conition and increment
	//
	int sum = 0;
	int x =5;
	//x = x+2;
	for (int r = 1; r <= 100; r++) {
		sum += r;
	//System.out.println(++x);
	System.out.println(r*10);
	//System.out.println(sum);
	//break;
	}
	//int  num = 0;
//	int a =50;
	//int b =10;
	
//	int rall = a<b ? ++a : --b;
//	System.out.println(rall);
	//System.out.println(a);
	//for(int i = 2; i <= 11; i+=2)// to print even number from 1-10
	//for(int i = 1; i <= 10; i=i+i)// to print total sum number from 1-100
	//the initialization shows were to start the count. it starts from 1
	//the condition here is i <= 10. it checks if i is < than 10 fom 1 till it reaches 11, then it stops 
	//the increment here is the i++. it tells the loop to continue, as in add 1 to the loop as it reloop
	{
		//i += i;
		//System.out.printf("%d = %d%n",i,num);
		//System.out.println("Sum: " + i);
		//System.out.printf("%d%n",i);
		//System.out.printf("sum =%d%n",(i*2));
	}
	}
}