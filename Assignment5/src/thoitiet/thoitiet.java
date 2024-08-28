
package thoitiet;

import java.util.Scanner;


public class thoitiet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day' temperatures?");
        int days = sc.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++)
        {
            System.out.print("Day " + (i+1) + "'s high temp: " );
            temps[i] = sc.nextInt();
            sum += temps[i];          
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++)
        {
            if(temps[i]>average)
            {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days above average");
        
    }
    
}
