import java.util.Scanner;
public class ComputeCircleArea{
        public static void main(String[] args){
	System.out.println("Welcome to our simple program");
	Scanner input = new Scanner(System.in); //declaring a scanner
	System.out.println("Please enter radius: ");
	double radius = input.nextDouble();
	final double PI=3.14;
	double area = radius * radius *PI;
	System.out.println("The area of the circle is "+area);
	System.out.println("Thank you for using our program");
        }
}