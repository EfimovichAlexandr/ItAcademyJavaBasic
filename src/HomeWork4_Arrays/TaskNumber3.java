package HomeWork4_Arrays;

import java.util.Arrays;

public class TaskNumber3 {
    // Создайте переменную для массива из 10 элементов.
    // Заполните его произвольными значениями целочисленного типа.
    // Найдите максимальный элемент и выведите его индекс.
    public static void main(String[] args) {
        System.out.println("В этом одномерном массиве");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (50 - 1 + 1) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nмаксимальный элемент:");
        Arrays.sort(array);
        System.out.print(array[array.length - 1]);

        // Или так
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("\nмаксимальный элемент: " + max);
    }
}
