package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        int total = 0;
        int start = 0;
        int rear = 5;
        int[] numbs = {13, 57, 21, 83, 42, 21};
        while (x == true) {
            System.out.println(Arrays.toString(numbs));
            System.out.println("The first entry in the array is in slot number " + (start+1));
            System.out.println("dequeue (1) or enqueue (2)?");
            int choice = scanner.nextInt();
            if (choice == 1) {
                for (int i = 0; i < numbs.length; i++) {
                    total = total + numbs[i];

                }
                if (total == 0) {
                    System.out.println("Array is Empty");
                } else {
                    numbs[start] = 0;
                    if (start == 5) {
                        start = 0;
                    } else {
                        start = start + 1;
                    }
                    if (rear == 5) {
                        rear = 0;
                    } else {
                        rear = rear + 1;
                    }
                }
            } else if (choice == 2) {
                int check = 0;
                for (int i = 0; i < numbs.length; i++) {
                    if (numbs[i] != 0) {
                        check++;
                    }

                }
                if (check == 6) {
                    System.out.println("Full");
                } else {
                    System.out.println("What Number do you want to add?");
                    numbs[rear] = scanner.nextInt();
                    if (rear == 5) {
                        rear = 0;
                    } else {
                        rear = rear + 1;
                    }
                }
            } else {
                System.out.println("Incorrect");
            }
        }
    }
}
