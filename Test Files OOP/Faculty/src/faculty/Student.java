
package faculty;
import java.util.*;
import lombok.* ;

public class Student<T> extends Course{
    @Getter
    @Setter
    ArrayList<T> list = new ArrayList<T>();
    private String name;
    @Override()
    public int getNumberOfStudents(){
        return 5;
    }
    
    public static <T> void getStudent(ArrayList<T> list){
        System.out.println("");
    }
    
    
    
    
}
