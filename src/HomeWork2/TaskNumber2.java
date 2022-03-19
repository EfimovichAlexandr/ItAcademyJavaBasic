package HomeWork2;

import java.util.Scanner;

public class TaskNumber2 {
    public static void main(String[] args) {
        /*
        Написать метод, который принимает на вход два целых числа, делает их
        суммирование и складывает результат с произведением двух этих чисел, и
        возвращает полученный результат из метода. Передать на вход в метод любые два
        числа. Вывести полученный результат работы метода на экран.
        */
        Scanner twoNumber = new Scanner(System.in);
        System.out.print("Введите два целых числа:\nПервое число = ");
        int numberOne = twoNumber.nextInt();
        System.out.print("Второе число = ");
        int numberTwo = twoNumber.nextInt();
        System.out.println("Сумма чисел плюс произведение чисел равно: "+sumPlusMultiplication(numberOne, numberTwo));
    }

    static int sumPlusMultiplication(int numberOne, int numberTwo) {
        return ((numberOne + numberTwo) + (numberOne * numberTwo));
    }
}



