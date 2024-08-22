
package Bai3;

import java.util.Scanner;

public class Bai3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        if (sc.hasNextInt())
        {
            String num = sc.next();
            System.out.println("\nThe integer entered is: " + num);
        }
        else
        {   
            System.out.println("\nThe number entered is invalid!");
        }       
        
    }
    
}
