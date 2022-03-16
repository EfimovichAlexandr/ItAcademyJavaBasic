package HomeWork3;

import java.util.Scanner;

public class TaskNumber3 {
    /*
    Задать целое число в виде переменной, это число – сумма денег в рублях.
    Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
     */
    public static void main(String[] args) {
        Scanner cash = new Scanner(System.in);
        System.out.print("Введите количество рублей без копеек: ");
        int sumRubles = cash.nextInt();        // Можно и long, но где ж столько рублей? ))
        if (sumRubles < 0) {                   // 0 считаем целым числом, если нет, то <=0
            System.out.println("Количество рублей не может быть отрицательным числом!\n" +
                    "Перезапустите программу и повторите ввод.");
        } else if (sumRubles >= 11 && sumRubles <= 14) {
            System.out.println(sumRubles + " рублей.");
        } else {
            switch (sumRubles % 10) {
                case 0, 5, 6, 7, 8, 9 -> System.out.println(sumRubles + " рублей.");
                case 2, 3, 4 -> System.out.println(sumRubles + " рубля.");
                case 1 -> System.out.println(sumRubles + " рубль.");
            }
        }
    }
}
