/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
/**
 *
 * @author workstation
 */
public class CreateDataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
       File file = new File("HelloWorld.txt");
       
        PrintWriter out = new PrintWriter(file);
       out.println("Hiiii Sarah ");
       out.close();
       
        System.out.println("Works fine!");}
       
       
        
        
    
    
}
