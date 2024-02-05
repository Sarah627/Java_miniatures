public class Person {
    //data feilds
    
    public String name;
    public int age;
    
    //methods
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public Person(){
    
     }
    
    
    
    public static int returnAcademicYear(){
        return 3;
    }
    
    // Mutator , Accessor 
    
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
   
    
    
}
