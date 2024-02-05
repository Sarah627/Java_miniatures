import java.util.Date;
import java.text.*;
class DateClass{

public static void main(String[] args){
	System.out.println("constructing date object....Date date = new Date()-- default constructor\n");
	Date date  = new Date();
	System.out.println("The date literal of the current time: -using toString method "+date.toString()+"\n");
	System.out.println("we use the getter method getTime() to get the time in milliseconds from the elapsed time since 1970 till the current time " +date.getTime()+"\n");         
	//you can use getMonth(), getDay(), getYear() and getHour()
	System.out.println("What if we want to print the time in a specifi format?... use SimpleDateFormat from text package, use the object's method -format- and send the date as parameter \n");
	SimpleDateFormat fdate = new SimpleDateFormat(" E dd/MM/yyyy ");
System.out.println(fdate.format(date));
	
}




}