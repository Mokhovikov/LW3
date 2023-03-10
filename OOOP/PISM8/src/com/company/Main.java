package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> task = new ArrayList<String>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Меню:" + "\n"
                    + "1. Добавить" + "\n"
                    + "2. Удалить" + "\n"
                    + "3. Найти дубликаты" + "\n"
                    + "4. Статистика" + "\n"
                    + "5. Поиск подстроки" + "\n"
                    + "6. Запись в файл" + "\n"
                    + "7. Длина строк" + "\n");
            int n = in.nextInt();
            switch (n) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                case 3:

                    System.out.println(Duplicate.calculateWordStat(String.join(", ", task)));


                default:
                    break;
            }
        }


    }

    public static void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu: add");
        String str = in.nextLine();
        task.add(str);
        System.out.println("Added: " + task.get(task.indexOf(str)));
    }

    public static void remove() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu: remove");
        for (int i = 0; i < task.size(); i++) {
            System.out.println(i + ": " + task.get(i));
        }
        int n = in.nextInt();
        for (int i = 0; i < task.size(); i++) {
            System.out.println(i + ": " + task.get(i));
        }
        task.remove(n);
        System.out.println("Removed");
        for (int i = 0; i < task.size(); i++) {
            System.out.println(i + ": " + task.get(i));
        }
    }
}
