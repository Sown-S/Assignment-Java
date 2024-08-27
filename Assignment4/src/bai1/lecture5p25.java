package bai1;

import java.util.Scanner;


public class lecture5p25 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = sc.nextInt();
        while (number != -1) 
        {
            sum = sum + number;     
            System.out.print("Enter a number (-1 to quit): ");
            number = sc.nextInt();
        }
        System.out.println("The total is " + sum);
        
    }
    
}
