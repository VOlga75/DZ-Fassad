package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a = "01100111";
        String b = "11001110";
        Scanner scanner = new Scanner(System.in);
        boolean w = true;
        System.out.println("Привет!");
        while (w) {
            System.out.println("Будете сами вводить бинарные числа для проверки? \n 1 - введу свои числа\n 2- доверю проверку программы ее автору");
            System.out.println("все остальное - завершение работы");
            switch (scanner.nextLine()) {
                case "1": {
                    try {
                        System.out.println("Введите первое двоичное число");
                        a = scanner.nextLine();
                        System.out.println("Введите второе двоичное число");
                        b = scanner.nextLine();
                        System.out.printf("%s + %s = %s или %s \n", a, b, bins.sum(a, b), bins.sumToPrint(a, b));
                        System.out.printf("%s + %s = %s или %s \n\n", a, b, bins.mult(a, b), bins.multToPrint(a, b));
                    } catch (NumberFormatException e) {
                        System.out.println("Рассчитываю на адекватность, а вы...");

                    }
                    break;
                }
                case "2": {
                    System.out.println("Авторская проверка:");
                    System.out.printf("%s + %s = %s или %s \n", a, b, bins.sum(a, b), bins.sumToPrint(a, b));
                    System.out.printf("%s + %s = %s или %s \n\n", a, b, bins.mult(a, b), bins.multToPrint(a, b));
                    break;
                }
                default: {
                    System.out.println("ЧАО!!!");
                    w = false;
                    break;
                }
            }
        }
    }
}
