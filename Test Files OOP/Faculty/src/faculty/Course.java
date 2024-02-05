package faculty;
import java.util.*;
import lombok.* ;
/**
 *
 * @author Sarah
 */
//@Data
@CustomAnnotation
@Getter
@Setter
        
class Course {
    //data fields
    private String courseName;
    private LinkedList<String> students = new LinkedList<>();
    private static int numberOfStudents;
    
    //methods
        

    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }
    public void addStudent(String student){
        this.students.add(student);
        numberOfStudents++;
    }
    
    public void dropStudent(String student){
        students.remove(student);
        numberOfStudents--;  
    }
  
    
    public void getStudents(){
        students.forEach(student -> {
            System.out.print(student+" ");
        });
    }
    
    public void clear(){
        students.clear();
    }
}
