
package q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Q3 {

   
    public static void main(String[] args) {
        try
        {
          File f = new File("C:\\Users\\TEMP\\Documents\\JavaApplication4"); 
          Scanner sc = new Scanner(f);
          while(sc.hasNextLine()){
              String Line = sc.nextLine();
              System.out.println(Line);
          }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        
    }
    
}
