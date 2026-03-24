package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Task 1
        System.out.println("Task 1 input: 5481");
        System.out.println("Task 1 output:");
        printDigits(5481);

        //Task 2
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("\nTask 2 input: 4, [3, 2, 4, 1]");
        System.out.print("Task 2 output: ");
        System.out.println(findAverage(arr2, arr2.length, 0, 0));

        //Task 3
        System.out.println("\nTask 3 input: 7, 10");
        System.out.println("Task 3 output: ");
        System.out.println("7 is " + isPrime(7, 2));
        System.out.println("10 is " + isPrime(10, 2));

        //Task 4
        System.out.println("\nTask 4 input: 5");
        System.out.print("Task 4 output: ");
        System.out.println(factorial(5));

        //Task 5
        System.out.println("\nTask 5 input: 5, 17");
        System.out.println("Task 5 output: ");
        System.out.println("F(5): " + fibonacci(5));
        System.out.println("F(17): " + fibonacci(17));

        //Task 6
        System.out.println("\nTask 6 input: 2, 10");
        System.out.print("Task 6 output: ");
        System.out.println(power(2, 10));

        //Task 7
        int[] arr3 = {1, 4, 6, 2};
        System.out.println("\nTask 7 input: 4, [1, 4, 6, 2]");
        System.out.print("Task 7 output: ");
        reverseOutput(arr3, 0);
        System.out.println();

        //Task 8
        System.out.println("\nTask 8 input: \"123456\", \"123a12\"");
        System.out.println("Task 8 output: ");
        System.out.println("123456: " + allDigits("123456"));
        System.out.println("123a12: " + allDigits("123a12"));

        //Task 9
        System.out.println("\nTask 9 input: \"hello\", \"recursion\"");
        System.out.println("Task 9 output: ");
        System.out.println("hello: " + countChars("hello"));
        System.out.println("recursion: " + countChars("recursion"));

        //Task 10
        System.out.println("\nTask 10 input: 32, 48");
        System.out.print("Task 10 output: ");
        System.out.println(findGCD(32, 48));
    }

    //Task1
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    //Task2
    public static double findAverage(int[] arr, int n, int idx, double sum) {
        if (idx == n) return n == 0 ? 0 : sum / n;
        return findAverage(arr, n, idx + 1, sum + arr[idx]);
    }

    //Task3
    public static String isPrime(int n, int divisor) {
        if (n <= 2) return (n == 2) ? "Prime" : "Composite";
        if (n % divisor == 0) return "Composite";
        if (divisor * divisor > n) return "Prime";
        return isPrime(n, divisor + 1);
    }

    //Task4
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    //Task5
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Task6
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    //Task7
    public static void reverseOutput(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        reverseOutput(arr, index + 1);

        System.out.print(arr[index] + " ");
    }

    //Task8
    public static String allDigits(String s) {
        if (s.isEmpty()) return "Yes";
        if (!Character.isDigit(s.charAt(0))) return "No";
        return allDigits(s.substring(1));
    }

    //Task9
    public static int countChars(String s) {
        if (s.isEmpty()) return 0;
        return 1 + countChars(s.substring(1));
    }

    //Task10
    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}