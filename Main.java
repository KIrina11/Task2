package ru.vsu.cs.kislova_i_v;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Input x = ");
        int x = readX();

        if (x <= 1000 && x >= -1000) {

            int max = searchMaxX(x);
            int min = searchMinX(x);
            
            writeArea(max, min);
        }
        else {
            System.out.print("Error");
        }
    }

    private static int readX() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private static int searchMaxX(int x) {
        if (x != 1000 && x != -1000) {

            if (Math.abs(x) / 100 > 0) {
                int digit3 = Math.abs(x) % 10;
                int digit2 = Math.abs(x) % 100 / 10;
                int digit1 = Math.abs(x) / 100;

                int comparison = Math.max(digit3, digit2);

                return Math.max(comparison, digit1);
            }

            if (Math.abs(x) / 100 < 1 && Math.abs(x) / 10 >= 1) {
                int digit2 = Math.abs(x) % 10;
                int digit1 = Math.abs(x) / 10;

                return Math.max(digit2, digit1);
            }

            if (Math.abs(x) / 10 < 1) {
                return x;
            }
        }
        return 1;
    }
    private static int searchMinX(int x) {
        if (x != 1000 && x != -1000) {

            if (Math.abs(x) / 100 > 0) {
                int digit3 = Math.abs(x) % 10;
                int digit2 = Math.abs(x) % 100 / 10;
                int digit1 = Math.abs(x) / 100;

                int comparison = Math.min(digit3,digit2);

                return Math.min(comparison,digit1);
            }

            if (Math.abs(x) / 100 < 1 && Math.abs(x) / 10 >= 1) {
                int digit2 = Math.abs(x) % 10;
                int digit1 = Math.abs(x) / 10;

                return Math.min(digit2, digit1);
            }

            if (Math.abs(x) / 10 < 1) {
                return Math.abs(x);
            }
        }
        return 0;
    }

    private static void writeArea(int max, int min) {
        if (min == max) {
            System.out.println("The number consists of one digit = " + min);
        }
        if (min != max) {
            System.out.println("Maximum digit = " + max + " minimum digit = " + min);
        }
    }
}
