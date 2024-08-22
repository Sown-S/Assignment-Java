package Bai2;

import java.util.Scanner;

public class Bai2 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        if (sc.hasNext()) 
        {
            String str = sc.next();
            System.out.println("\nThe string entered is: " + str);

        } else 
        {
            System.out.println("\nInvalid string was entered!");
        }

    }

}
