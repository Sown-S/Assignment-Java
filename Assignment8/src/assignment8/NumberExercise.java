package assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberExercise {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of elements: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements " + (i + 1) + " : ");
            int num = sc.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("number[]= " + Arrays.toString(numbers.toArray()));
    }

    public static int findMax2(ArrayList<Integer> numbers) {

        if (numbers.size() < 2) {
            System.out.println("Array doesn't have enough elements");
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
    }

}
