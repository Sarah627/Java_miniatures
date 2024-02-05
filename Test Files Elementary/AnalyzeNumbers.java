import java.util.Scanner;
public class AnalyzeNumbers{
         public static void main(String[] args){
	//prompt user to enter 10 elements
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter 10 numbers");
	//declaration of our variant containers:
	//Array of numbers:
	int[] pocket = new int[10];
	//our parameters
	double avg;
	int sum = 0, count = 0;
	//first loop to store input
	for( int i = 0;i<pocket.length;i++){
                	      pocket[i] = input.nextInt();
                       //if you want to fill the array automatically using random numbers range from 1 to 100
                       /* pocket[i] = (int)(1+Math.random()*99);
                          System.out.println(pocket[i]);*/
	      sum += pocket[i];	
	}
	//calculate average
	avg = sum / pocket.length;
       	System.out.println("average is: "+avg);
	// second loop for calculating the number of elements above avg
	for( int integer : pocket){
	   if(integer > avg) count++;
	}
	//print out the number of elements which are above average
        	System.out.println("The number of elements above average is: "+ count);






























	} 








		}