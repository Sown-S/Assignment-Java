package bai1;

import java.util.Scanner;



public class lecture5p27 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String phrase;
        do {
        System.out.print("Type your password: ");
        phrase = sc.next();
        } while (!phrase.equals("duytan"));
        
    }
    
}
