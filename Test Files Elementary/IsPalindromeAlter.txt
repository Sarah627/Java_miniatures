import java.util.*;
import java.lang.StringBuilder;
class IsPalindromeAlter{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String s = input.next();
		StringBuilder str = new StringBuilder(s);
		System.out.println((str.reverse().toString()).equals(s)? "Yes":"No");
		
}



}