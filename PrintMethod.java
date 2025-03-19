public class PrintMethod{
	public static void main(String[] args) {
			System.out.print("\"Learning Java is Fun,\"\n"); // u can also use /n/n without those "". (escape 
			System.out.print("Always Fun!!");  //added \n, "\"
			
			System.out.println();
			System.out.println("Java learing is  Fun");
			System.out.println("\t starts a new paragraph here"); // added new paragraph \t
			
			// printf() goes with format specifiers %s string ,d decimal,%f floating point(0.3,5.),%.nf
			//can't use println
			System.out.printf("My name is %s and I love %s. Good day everyone%n","You","Programming");
			System.out.printf("I am %d years old%n",25); // print the whole number 25
			System.out.printf("I bought Java JDK with %f naira%n",159.900);
			System.out.printf("I bought Java JDK with %c%.2f naira%n",'$',159.900); // %.2f change the float to 2 decimal place
			
	//character in'$,%,&' while string is in "Name"
	
			boolean isJavaFun = true;
			System.out.printf("is Java fun? %b",isJavaFun); // git staus >> git add -A >> git commint -m "name of the file" >> git push // moves to ur github
			
	}
}