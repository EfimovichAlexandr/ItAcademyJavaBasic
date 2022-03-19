package HomeWork4_Arrays;

import java.util.Arrays;

public class TaskNumber4 {
    // Создайте переменную для массива из 10 элементов.
    // Заполните его произвольными значениями целочисленного типа.
    // Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
    // Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение
    // разницы индексов между максимальным и минимальным значениями.

    public static void main(String[] args) {
        System.out.println("В этом одномерном массиве");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        Arrays.sort(array);
        for (int sort : array) {
            System.out.print(sort + " ");
        }

        int sumNumbers = 0;
        for (int j = 1; j < array.length - 1; j++) {
            sumNumbers += array[j];
        }
        System.out.println("\nсумма элементов, расположенных между минимальным и максимальным значениями равна: " +
                sumNumbers);
    }
}
