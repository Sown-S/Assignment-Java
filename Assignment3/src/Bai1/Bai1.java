package Bai1;

import java.util.Scanner;

public class Bai1 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your birthday: ");
        String birth = sc.nextLine();
        System.out.print("Enter your sex: ");
        String sex = sc.next();
        sc.nextLine();
        System.out.print("Enter your major: ");
        String major = sc.nextLine();
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your hometown: ");
        String hometown = sc.nextLine();

        System.out.println("\n\tInformation");
        System.out.println("1. Name: " + name);
        System.out.println("2. Age: " + age);
        System.out.println("3. Birthday: " + birth);
        System.out.println("4. Sex: " + sex);
        System.out.println("5. Major: " + major);
        System.out.println("6. GPA: " + gpa);
        System.out.println("7. Hometown: " + hometown);
    }

}
