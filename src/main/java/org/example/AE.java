package org.example;

import java.util.Scanner;
/*
Простая задача 1: Проверка деления на ноль
Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением "Деление на ноль недопустимо".
Иначе выведите результат деления на экран.
 */
public class AE extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int number1 = sc.nextInt();
        System.out.println("Введите число 2:");
        int number2 = sc.nextInt();
        try {
            int result = number1/number2;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Деление на ноль недопустимо!");
        }
    }
}
