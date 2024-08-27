package bai1;

import java.util.Scanner;

public class lecture4 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        switch (n) 
        {
            case 5: System.out.println("Five\n"); break;
            case 4: System.out.println("Four\n"); break;
            case 3: System.out.println("Three\n"); break;
            case 2: System.out.println("Two\n"); break;
            case 1: System.out.println("One\n"); break;
            default : System.out.println("No!\n");
            //throw new AssertionError();
        }
    }
        
}
    
