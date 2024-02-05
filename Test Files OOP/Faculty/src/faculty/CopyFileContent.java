package faculty;

/**
 *
 * @author Sarah Sameh
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class CopyFileContent {
    ArrayList<Integer> array = new ArrayList<>(5);
 
    public static void main(String[] args) throws FileNotFoundException, IOException{
    //creating file object
    System.out.println("please enter file names with .txt extension please");
    Scanner input  = new Scanner(System.in);
    File inputFIile = new File(input.nextLine());
    File outputFIile = new File(input.nextLine());
    file.createNewFile();
    copy.createNewFile();
    //test
        System.out.println((file.exists() && copy.exists())?"true":"false");
    // --> returns true so, we created the files we are ready to go
    //first you need to take input from user to write it in the target file making the whole process generic and flexible
   // if you want your file to append previous data set the second parameter in FileOutputStream to (file, true)
    try(PrintWriter writer = new PrintWriter(new FileOutputStream(file))){
        
            writer.write(input.nextLine());
    }
    try(Scanner reader = new Scanner(new FileInputStream(file));
            PrintWriter writerCopy = new PrintWriter(new FileOutputStream(copy));){
       
         while(reader.hasNext()){
            writerCopy.println(reader.nextLine());
            
        }
        
    }
    
    
    
    }
}
