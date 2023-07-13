
package exceptionhnadling;

import java.util.Scanner;
public class ExceptionHnadling 
        
        
{

 
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int no1,no2,ans;
        
        System.out.println("enter number1");
        no1= sc.nextInt();
        
        System.out.println("enter number 2");
        no2=sc.nextInt();
        try
        {
            float z;
            z=no1/no2;
            System.out.println(z);
            
            
            
            
        }
        catch(ArithmeticException e){
        System.out.println("divide by 0 error");
        }
    }
     
    
}
