class Circle3rdEdition{

static class Circle{
//the class is static because it's an inner class
double radius;
static int numberOfCirclesCreated = 0;
//constructor
Circle (){
radius = 1;
numberOfCirclesCreated++;}
Circle(double rad){
radius = rad;
numberOfCirclesCreated++;}

static int getNumberOfCircles(){
return numberOfCirclesCreated;}
double area(){
return radius*radius*Math.PI;}
double circumference(){
return radius*Math.PI*2;}
}
public static void main(String[] args){
Circle c1 =  new Circle(5.0);
System.out.println("The numbe r of Circles created: "+ c1.getNumberOfCircles());
}
}