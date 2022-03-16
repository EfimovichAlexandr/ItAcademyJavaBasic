package HomeWork3;

import java.util.Scanner;

public class TaskNumber1 {
    /*
    Создайте метод с одним целочисленным параметром.
    Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
     */
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Введите любое целое число больше нуля: ");
        long enteredNumber = numbers.nextLong();
        if (enteredNumber < 10) {               // 10 потому, что до 10 цифры, а не число!
            System.out.println("Введенное число не соответствует параметрам.");
        } else if (enteredNumber % 10 == 7) {
            System.out.println("В этом числе последняя цифра 7.");
        } else {
            System.out.println("В этом числе последняя цифра не 7.");
        }

    }
}
