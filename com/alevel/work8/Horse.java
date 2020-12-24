package com.alevel.work8;

import java.util.Scanner;

public class Horse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please, entered place of Horse, letter ");
        String letter1 = scanner.nextLine();
        System.out.println("Please, entered place of Horse, digital ");
        int columnn1 = scanner1.nextInt();
        int row1 = findRow(letter1);
        System.out.println("Please, entered new place of Horse, letter");
        String letter2 = scanner2.nextLine();
        System.out.println("Please, entered new place of Horse, digital ");
        int columnn2 = scanner3.nextInt();
        int row2 = findRow(letter2);
        if (((Math.abs(columnn1 - columnn2) == 2) && (Math.abs(row1 - row2) == 1) || ((Math.abs(columnn1 - columnn2) == 1) && (Math.abs(row1 - row2) == 2)))) {
            System.out.print("It is possible");
        } else {
            System.out.print("It is impossible");
        }
    }

    public static int findRow(String letter) {
        int row3 = 100;
        switch (letter) {
            case "a":
                row3 = 1;
                break;
            case "b":
                row3 = 2;
                break;
            case "c":
                row3 = 3;
                break;
            case "d":
                row3 = 4;
                break;
            case "e":
                row3 = 5;
                break;
            case "f":
                row3 = 6;
                break;
            case "g":
                row3 = 7;
                break;
            case "h":
                row3 = 8;
                break;
        }
        return row3;
    }
}
