class StaticInitializerBlock{
	{System.out.println("this is instance block can run several times");
	}
	static{System.out.println("This is a static block executes only one time when the class is loaded");}
public static void main(String[] args){
	StaticInitializerBlock object = new StaticInitializerBlock();

	System.out.println("this is the main method in the class");}



}