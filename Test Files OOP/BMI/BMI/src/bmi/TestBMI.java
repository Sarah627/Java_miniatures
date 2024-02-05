package bmi;

import java.util.Scanner;


/**
 *
 * @author Sarah Sameh
 */
public class TestBMI {

    public static void main(String[] args) {
       //this main class is to test BMI class if it works right
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your name, age, height in meters and weight in kg: ");
        BMI person = new BMI( input.next(), input.nextInt(), input.nextDouble(), input.nextDouble());
        System.out.printf("your BMI is: %.2f\n %s you are %s" ,person.getBMI(),person.getName(),person.getStatus());
    }
    
}
