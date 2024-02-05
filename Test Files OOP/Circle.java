public class Circle{

public static void main(String[] args){
//creating a circle object
Circle circle = new Circle(5.0);
System.out.println("My circle's area is: "+ circle.area());
}

//defining data fields
double radius;

//constructors
Circle(){
radius = 1;
}

Circle(double userRadius){
radius = userRadius;
}

//object's behaviour or methods
double area(){
return radius * radius * Math.PI;}

double circumference(){
return 2 * radius * Math.PI;}
 







}