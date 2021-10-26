package ru.vsu.cs.kislova_i_v;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Input x = ");
        int x = readX();

        if (x <= 1000 && x >= -1000) {

            int max = search_max_X(x);
            int min = search_min_X(x);
            
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

    private static int search_max_X(int x) {
        if (x != 1000 && x != -1000) {

            if (Math.abs(x) / 100 > 0) {
                int n3 = Math.abs(x) % 10;
                int n2 = Math.abs(x) % 100 / 10;
                int n1 = Math.abs(x) / 100;

                int c1 = Math.max(n3, n2);

                return Math.max(c1, n1);
            }

            if (Math.abs(x) / 100 < 1 && Math.abs(x) / 10 >= 1) {
                int n2 = Math.abs(x) % 10;
                int n1 = Math.abs(x) / 10;

                return Math.max(n2, n1);
            }

            if (Math.abs(x) / 10 < 1) {
                return x;
            }
        }
        return 1;
    }
    private static int search_min_X(int x) {
        if (x != 1000 && x != -1000) {

            if (Math.abs(x) / 100 > 0) {
                int n3 = Math.abs(x) % 10;
                int n2 = Math.abs(x) % 100 / 10;
                int n1 = Math.abs(x) / 100;

                int c1 = Math.min(n3,n2);

                return Math.min(c1,n1);
            }

            if (Math.abs(x) / 100 < 1 && Math.abs(x) / 10 >= 1) {
                int n2 = Math.abs(x) % 10;
                int n1 = Math.abs(x) / 10;

                return Math.min(n2, n1);
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
