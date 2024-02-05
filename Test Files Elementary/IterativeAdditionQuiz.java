import java.util.Scanner;
import java.util.*;
public class IterativeAdditionQuiz{
	public static void main(String [] args){
		System.out.println("\t\tWelcome to Addition Quiz");
		System.out.println("Grading Criteria: You have total 5 marks every wrong answer costs you 1 Mark");
		Long startTime, endTime, totalQuizTime;
		startTime = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		int num1, num2, result, answer,mark=5, counter= 0;
		num1 = (int)(Math.random() * 10);
		num2 = (int)(Math.random() * 10);
		System.out.print("\t"+num1 + " + " + num2 + " ?  ");
		answer = input.nextInt();
		result = num1 + num2;
		while(result != answer){
			System.out.println("\t"+"Wrong Answer! please try again");
			System.out.print("\t"+num1 + " + " + num2 + " ?  ");
			answer = input.nextInt();
			counter++;
			mark--;
		}
		endTime = System.currentTimeMillis();
		totalQuizTime = endTime - startTime;
		System.out.println("\t"+"Correct!");
		System.out.println("\t"+"You got: "+ mark + " Marks out of 5 , number of wrong answers: "+ counter+" Total Quiz Time is: "+ totalQuizTime/1000+ " Seconds");
		System.out.println("\t"+"Thanks!");
	}



}