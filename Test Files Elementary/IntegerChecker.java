import java.util.Scanner;
public class IntegerChecker{

public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number to check: ");
	int num = input.nextInt();
	if (num> 0) System.out.println("positive");
	else if(num <0) System.out.println("negative");
	else System.out.println("zero"); 
}
}