import java.util.Scanner;
public class isPalindrome{
	public static void main(String []args){
		int high, low = 0; 
		boolean isPalindrome = true;
		String input = "";
		System.out.println(" This is a simple program to check if the word is Plaindrome or not");
		System.out.println("Please enter word to check: ");
		Scanner in = new Scanner(System.in);
		input = in.nextLine();
		high = input.length() - 1;
		while(low  < high){
			if( input.charAt(low) != input.charAt(high) ){
				isPalindrome = false;
				break;}
			low++;
			high--;
		}
		if(isPalindrome)
			System.out.println("The word is Palindrome");
		else
			System.out.println("The word isn't Palindrome");
		System.out.print("Thanks!");
	}



}