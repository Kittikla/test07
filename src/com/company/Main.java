package com.company;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();
        for (int p = 0; p < R; p++) {

            for (int i = 0; i < C; i++) {
                System.out.print("* ");

            }
            System.out.println("* ");

        }
    }
}