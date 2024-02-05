 package faculty;
import java.util.*;
//import java.io.File;

/**
 *
 * @author Sarah Sameh
*/
public class Faculty {
    
   static{
       System.out.println("Testing if we can run this first");
   
   }
    
    public static void printThing(Printable thing){
        thing.printvalue();
    }
     //@SuppressWarnings("unchecked")
    static void wordsList() {
        ArrayList wordList = new ArrayList<>();

    // This causes an unchecked warning
        wordList.add("programiz"); 

        System.out.println("Word list => " + wordList);
  }

    
    public static void main(String[] args) {
//        @SuppressWarnings("unused variable") int numberIwontUse = 3;
 
        
        //Printable object = () -> System.out.println("hi"); // lambda expression 
        //printThing(object);
//        printThing(() -> "hello");
        wordsList();
        
      //test main class
        Scanner input =  new Scanner(System.in);
        int number;
        boolean key = true;
        Course course = new Course();
        if (course.getClass().isAnnotationPresent(CustomAnnotation.class)) {
            System.out.println("yessss");
            
        }
        
        System.out.println("Welcome in our Scheduler, please enter the course name: ");
        course.setCourseName(input.nextLine());
        System.out.println("Welcome in "+course.getCourseName());
        
        
        do{
            try{
                System.out.println("enter the number of students you want to add to this course: ");
                number = input.nextInt();
                for(int i = 0; i<number; i++)
                course.addStudent(input.next());
                key = false;
            }
            catch(InputMismatchException i){
                System.out.println("please inter a valid integer!");  
                input.nextLine();
            }
        }while(key);   
        
        
        System.out.println("the number of students you've added: "+course.getNumberOfStudents()+" they are: ");
        course.getStudents();
        
        System.out.println("\nName of student you want to drop: ");
        String student = input.next();
        course.dropStudent(student);
        course.getStudents();
        System.out.println("\nnumber of students after drop: "+course.getNumberOfStudents());
        
        System.out.println("we can override without using the override annotation");
        Student s1 = new Student();
        int number2 = s1.getNumberOfStudents();
        System.out.println(number2);
        
        
         
    }
    }
    

