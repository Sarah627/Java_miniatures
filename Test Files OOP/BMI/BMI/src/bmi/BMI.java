
package bmi;

/**
 *
 * @author Sarah Sameh
 */
public class BMI {
    
    //data fields
    private String name;
    private int age;
    private double weight, height;
    
    //methods (operations)
    
    public BMI(){
    }
    
    public BMI(String name, int age, double height, double weight ){
        this.name = name;
        this.age = age;
        this.height = height;
         this.weight = weight;
    }
    
    public double getBMI(){
        return weight/(height*height);
    }
    
    public String getStatus(){
        if (getBMI()<18.5)
            return "Under Weight";
        else if (getBMI()>= 18.5 && getBMI()<25)
            return "Normal Weight";
        else if (getBMI()>=25 && getBMI() <30)
            return "Overweight";
        else
            return "obese";         
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public double getHeight(){
        return height;
    }
    
}
