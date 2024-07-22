import java.util.Scanner;
public class CalculateTheta {
    public static void main(String[] args){
        System.out.println("This is simple program to calculate the Theta -angle- between two vectors");
        System.out.println("please, enter components of the two vectors as follows" +
                " V1x V1y V2x V2y with enter after each value" );
        // identifying all variables needed
        int V1x, V1y, V2x, V2y, dotProduct;
        double lengthOfV1, lengthOfV2, cosineTheta, theta;

        // prompt user to enter V1 and V2 vector components
        Scanner input = new Scanner(System.in);
        V1x = input.nextInt();
        V1y = input.nextInt();
        V2x = input.nextInt();
        V2y = input.nextInt();

        // do the needed calculations
        // cosine theta is equals the dot product of the two vectors divided by the products of their lengths
        lengthOfV1 = Math.sqrt(Math.pow(V1x,2)+Math.pow(V1y,2));
        lengthOfV2 = Math.sqrt(Math.pow(V2x,2)+Math.pow(V2y,2));
        dotProduct = (V1x * V2x) + (V1y * V2y);
        cosineTheta = dotProduct / (lengthOfV1 * lengthOfV2);
        theta = Math.acos(cosineTheta);
        System.out.println("The angle between the two vectors is "+ Math.round(Math.toDegrees(theta)) + " Degrees");

    }
}