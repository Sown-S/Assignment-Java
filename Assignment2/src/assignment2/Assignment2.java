package assignment2;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap 2 so nguyen: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Ket qua la: ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

}
