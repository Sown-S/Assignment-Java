package bai3;

import java.util.Random;
import java.util.Scanner;


public class hw_lecture5p37 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int point = 0;
        int wrong = 0;
        do 
        {   
            int sum = 0;
            int r = rand.nextInt(4) + 2;
            for (int i = 1; i <= r; i++)
            {
                int number = rand.nextInt(10) + 1;
                System.out.print(" + " + number);
                sum = sum + number;
            }
            System.out.print(" = ");
            int answer = sc.nextInt();
            if (answer == sum)
            {
                point++;
            }
            else
            {
                System.out.println("Wrong! The answer was " + sum);
                wrong++;
            }                        
        } while (wrong < 3);
        System.out.println("You earned " + point + " total points");
                
    }
    
}
