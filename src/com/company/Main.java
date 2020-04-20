package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
        int o = Integer.MIN_VALUE;
        for(int i = 0; i<n ;i++){
            int x = in.nextInt();
            if(o<x){
                o=x;
            }
        }
        System.out.println(o);




    }
}
