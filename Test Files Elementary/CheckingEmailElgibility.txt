import java.util.Scanner;
public class CheckingEmailElgibility{

public static void main(String[] args){
	System.out.println("Simple program to confirm if the email is acceptable or not");
	System.out.println("please enter username only 5 characters then @ sign then the rest");
	Scanner input = new Scanner(System.in);
	String email = input.nextLine();
	String validation = (email.charAt(5) == '@')? " valid email " : " invalid email ";
	System.out.println(validation);

}
}