package HomeWork4_Arrays;

import java.util.Random;

public class TaskNumber4 {
    // Создайте переменную для массива из 10 элементов.
    // Заполните его произвольными значениями целочисленного типа.
    // Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
    // Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение
    // разницы индексов между максимальным и минимальным значениями.

    public static void main(String[] args) {
        System.out.println("В этом одномерном массиве");
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max1 = array[0];
        int indexMax1 = 0;
        int indexMax2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max1 = array[i];
                indexMax1 = i;
            }
            if (max1 <= array[i]) {
                max1 = array[i];
                indexMax2 = i;
            }
        }

        int min1 = array[0];
        int indexMin1 = 0;
        int indexMin2 = 0;
        for (int j = 0; j < array.length; j++) {
            if (min1 > array[j]) {
                min1 = array[j];
                indexMin1 = j;
            }
            if (min1 >= array[j]) {
                min1 = array[j];
                indexMin2 = j;
            }
        }

        int sumNumber = 0;
        if (indexMax2 > indexMax1 && indexMin2 > indexMin1) {
            if (indexMax2 > indexMin2) {
                for (int i = indexMin1 + 1; i < indexMax2; i++) {
                    sumNumber += array[i];
                }
            } else {
                for (int i = indexMax1 + 1; i < indexMin2; i++) {
                    sumNumber += array[i];
                }
            }
        }
        if (indexMax2 == indexMax1 && indexMin2 > indexMin1) {
            if (indexMax1 > indexMin2) {
                for (int i = indexMin1 + 1; i < indexMax1; i++) {
                    sumNumber += array[i];
                }
            } else if (indexMax1 < indexMin1) {
                for (int i = indexMax1 + 1; i < indexMin2; i++) {
                    sumNumber += array[i];
                }
            } else {
                if (indexMax1 - indexMin1 > indexMin2 - indexMax1) {
                    for (int i = indexMin1 + 1; i < indexMax1; i++) {
                        sumNumber += array[i];
                    }
                } else {
                    for (int i = indexMax1 + 1; i < indexMin2; i++) {
                        sumNumber += array[i];
                    }
                }
            }
        }
        if (indexMax2 > indexMax1 && indexMin2 == indexMin1) {
            if (indexMin1 > indexMax2) {
                for (int i = indexMax1 + 1; i < indexMin1; i++) {
                    sumNumber += array[i];
                }
            } else if (indexMin1 < indexMax1) {
                for (int i = indexMin1 + 1; i < indexMax2; i++) {
                    sumNumber += array[i];
                }
            } else {
                if (indexMin1 - indexMax1 > indexMax2 - indexMin1) {
                    for (int i = indexMax1 + 1; i < indexMin1; i++) {
                        sumNumber += array[i];
                    }
                } else {
                    for (int i = indexMax1 + 1; i < indexMin2; i++) {
                        sumNumber += array[i];
                    }
                }
            }
        }
        if (indexMax2 == indexMax1 && indexMin2 == indexMin1) {
            if (indexMin1 > indexMax1) {
                for (int i = indexMax1 + 1; i < indexMin1; i++) {
                    sumNumber += array[i];
                }
            } else {
                for (int i = indexMin1 + 1; i < indexMax1; i++) {
                    sumNumber += array[i];
                }
            }
        }
        System.out.println("Сумма элементов, расположенных между минимальным и максимальным значениями равна: " +
                sumNumber + ".");
    }
}
