package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        double x, y;
        char c;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число");
            x = scanner.nextDouble();
            System.out.println("Введите второе число");
            y = scanner.nextDouble();
            System.out.println("Введите операцию");
            c = scanner.next().charAt(0);
            if(c =='+' || c =){
                System.out.println(x+y);
            }
            else if(c == '-'){
                System.out.println(x-y);
            }
            else if(c == '*'){
                System.out.println(x*y);
            }
            else if(c == '/'){
                System.out.println(x/y);
            }

        }
    }