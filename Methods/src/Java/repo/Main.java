package Java.repo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //invoking a method just requires the method's name and pass its parameters if they exist.
        //This example is to calculate the distance between two points:
        System.out.println("Please enter the points in order as follows: x1 x2 y1 y2");
        // declaring Scanner object and the entries:
        Scanner input = new Scanner(System.in);
        int x1,x2,y1,y2;


        //prompt input from the user:
        x1 = input.nextInt();
        x2 = input.nextInt();
        y1 = input.nextInt();
        y2 = input.nextInt();

        // print the result
        System.out.println(calculateDistance(x1,x2,y1,y2));

    }

    public static double calculateDistance(int x1, int x2 , int y1, int y2){
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        double distance = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2) );
        return distance;
    }
}
