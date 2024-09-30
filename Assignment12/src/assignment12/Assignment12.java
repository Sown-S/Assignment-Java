package assignment12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new File("D:\\Java\\Code\\Assignment12\\weather.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day' temperatures? ");
        int days = sc.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        out.printf("Average temp = %.1f", average);
        out.println();
        out.println(count + " days above average");
        out.println("Temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        out.println("Two hottest days: " + temps[temps.length - 1]+ ", " + temps[temps.length - 2]);
    }

}
