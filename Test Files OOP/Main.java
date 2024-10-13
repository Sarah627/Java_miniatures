import java.util.Scanner;

class Building{
    int floors;
    Building(int floors){
        this.floors = floors;
        
    }
}

class House extends Building{
    
    boolean backyard;
    String description;
    
    House(Character yn, int floors){
        super(floors);
        backyard = (yn.equals('y'))? true : false;
        description = (backyard)? "House of " +floors+ " floors with a backyard" : "House of " +floors+ " floors without a backyard";
        System.out.println(description);
        
    }
    
}

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Do you have a backyard? (y/n): ");
	    char haveBackyard = input.next().charAt(0);
	    System.out.print("How many floors does your house have? ");
	    int floors = input.nextInt();
	    House house =  new House(haveBackyard,floors);
	    System.out.print(house instanceof Building);
	    
	    
	}
}