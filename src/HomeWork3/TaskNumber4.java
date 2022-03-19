package HomeWork3;

import java.util.Scanner;

public class TaskNumber4 {
    // Задать три числа – день, месяц, год.
    // Вывести на экран в виде трех чисел дату следующего дня.
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);
        System.out.print("Введите дату в формате день, месяц, год:\nДень ");
        int day = date.nextInt();
        System.out.print("Месяц ");
        int month = date.nextInt();
        System.out.print("Год ");
        int year = date.nextInt();
        // Проверка правильности ввода
        if (day <= 0 || month <= 0 || year <= 0) {
            System.out.println("Такой даты не существует.");
        }else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31) {
                System.out.println("Такой даты не существует");
            }
        }else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                System.out.println("Такой даты не существует");
            }
        }else if (day == 29 && month == 2 && year % 4 != 0 && year % 100 != 0 && year % 400 != 0) {
            System.out.println("Такой даты не существует");
        }
        // Вычисление завтрашней даты.
        if (month == 2 && year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            if (day >= 1 && day <= 28) {
                System.out.println("Завтра будет: " + (day + 1) + "." + month + "." + year + " г.");
            }else if (day == 29) {
                System.out.println("Завтра будет: 1." + (month + 1) + "." + year + " г.");
            }
        } else if (month == 2 && year % 4 != 0 && year % 100 != 0 && year % 400 != 0) {
            if (day >= 1 && day <= 27) {
                System.out.println("Завтра будет: " + (day + 1) + "." + month + "." + year + " г.");
            }else if (day == 28) {
                System.out.println("Завтра будет: 1." + (month + 1) + "." + year + " г.");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 30) {
                System.out.println("Завтра будет: " + (day + 1) + "." + month + "." + year + " г.");
            }else if (day == 31) {
                System.out.println("Завтра будет: 1.1." + (year + 1) + " г.");
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            if (day >= 1 && day <= 30) {
                System.out.println("Завтра будет: " + (day + 1) + "." + month + "." + year + " г.");
            } else if (day == 31) {
                System.out.println("Завтра будет: 1." + (month + 1) + "." + year + " г.");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 29) {
                System.out.println("Завтра будет: " + (day + 1) + "." + month + "." + year + " г.");
            }else if (day == 30) {
                System.out.println("Завтра будет: 1." + (month + 1) + "." + year + " г.");
            }
        }
    }
}

