import java.util.Scanner;
public class AdditionQuiz{
         public static void main(String[] args){
	long num1 = System.currentTimeMillis() % 10;
	long num2 = System.currentTimeMillis() / 10 %10;
	System.out.println("Mini-Addition Quiz");
	Scanner input = new Scanner(System.in);
	System.out.print("Please Enter your name: ");
	String name = input.nextLine();
	System.out.println("Hello "+name);
	System.out.println(num1+ " + " + num2 + " ?");
	int ans = input.nextInt();
	if(ans == num1+num2)
	   System.out.print("Right Answer");
	else
	   System.out.print("Wrong Answer");
         }
}