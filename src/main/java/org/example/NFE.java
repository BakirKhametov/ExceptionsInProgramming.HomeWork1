package org.example;

import java.util.Scanner;

/*
Простая задача 2: Обработка некорректного ввода

Напишите программу, которая запрашивает у пользователя его возраст.
Если введенное значение не является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод".
Иначе выведите возраст на экран.
 */
public class NFE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш возраст:");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);
            System.out.println(age);
        }catch (NumberFormatException e){
            System.out.println("Некорректный ввод");
        }
    }
}
