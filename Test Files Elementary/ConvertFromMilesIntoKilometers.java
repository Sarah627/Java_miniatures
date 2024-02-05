import java.util.Scanner;
public class ConvertFromMilesIntoKilometers{
        public static void main(String[] args){
	System.out.println("Program to convert miles into Kilometers");
	Scanner input = new Scanner(System.in);
	System.out.print("Please, Enter miles: ");
	double miles = input.nextDouble();
	final double KILOMETERS_PER_MILE = 1.609;
	double kilometers = miles * KILOMETERS_PER_MILE;
	System.out.println("Kilometers: "+kilometers);
	System.out.print("Thank you for using our simple program");
	
        }
}