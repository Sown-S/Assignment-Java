package assignment8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String check;
        do {
            System.out.println("\t\tMENU");
            System.out.println("1. Import array");
            System.out.println("2. Export array");
            System.out.println("3. Find the second largest value");
            System.out.println("4. Delete odd elements");
            System.out.println("0. Exit!");
            System.out.print("Your choose: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    NumberExercise.EnterData(numbers);
                }
                break;

                case 2: {
                    NumberExercise.DisplayData(numbers);
                }
                break;

                case 3: {
                    int secondLargest = NumberExercise.findMax2(numbers);
                    System.out.println("The second largest number: " + secondLargest);
                }
                break;

                case 4: {
                    NumberExercise.deleteOddNumber(numbers);
                    NumberExercise.DisplayData(numbers);
                }
                break;

                case 0: {
                    System.out.println("Exited!");
                    System.exit(0);
                }
                break;

                default:
                    System.out.println("The entered value does not exist");

            }
            System.out.println("\nEnter 'yes' to continue");
            check = sc.next();
        } while (check.equals("yes"));

    }

}
