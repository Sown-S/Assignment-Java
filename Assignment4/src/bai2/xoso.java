package bai2;

import java.util.Random;
import java.util.Scanner;


public class xoso 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        int lucky = rand.nextInt(100) + 1;
        System.out.println("Lucky number: " + lucky);
        if (lucky==number)
        {
            System.out.println("Congratulations!");
        }
        else
        {
            System.out.println("Good luck next time!");
        }    
        
    }
    
}
