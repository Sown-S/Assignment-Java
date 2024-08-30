package assignment6;

import java.util.Random;
import java.util.Scanner;


public class exercise1 
{

     public static void check(int n)
    {
        if (n % 2 == 0)
        {
            System.out.println("La so chan!");
        }
        else
        {
            System.out.println("La so le!");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String string;
        do 
        {
            int n = rand.nextInt(100) + 1;
            System.out.print("Nhap 'yes' de biet ket qua: ");
            string = sc.next();
            if(string.equals("yes"))
            {
                System.out.print(n + " ");
                check(n);
            }
            else
            {
                System.out.print(n + " ");
                check(n);
            }         
        } while (string.equals("yes"));
        
    }

}
    

