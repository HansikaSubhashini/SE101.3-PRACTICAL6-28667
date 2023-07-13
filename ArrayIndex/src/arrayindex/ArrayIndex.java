
package arrayindex;
import java.util.Scanner;

public class ArrayIndex {
    

   
    public static void main(String[] args)
    {
        int array[]={1,2,3,4,5};
        int index=6;
        try
        {
            int element= array[index];
            System.out.println("Element at index " +index +": "+ element);
            
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid Index Accessed. Index " +index + " is out of bounds.");
        }
        
        
     
    }
    
}
