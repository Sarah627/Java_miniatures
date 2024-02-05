import java.util.Scanner;
public class SimpleIfDemo{
       public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter number to test: ");
	int number = input.nextInt();
	if (number % 5 == 0)
	      System.out.println("HiFive");
	if (number % 2 == 0)
	      System.out.println("Hi Even");
	else{
		System.out.println("Hi Odd");
	}
	System.out.print("Thank U for using our simple program");
	
}
}