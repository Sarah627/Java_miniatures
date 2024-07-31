import java.util.Scanner;
public class CheckingPasswordLength{

public static void main(String[] args){
	// This is simple program to check password length
	System.out.println("Please enter a password which at least 8 characters long and at most 16 characters");
	Scanner input =  new Scanner(System.in);
	String password = input.nextLine();
	if (password.length() < 8)
		System.out.println("password is too short");
	else if( password.length() >16) 
		System.out.println("password is too long");
	else
		System.out.println("password is okay");

}


}