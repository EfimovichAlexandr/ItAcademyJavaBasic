package HomeWork4_Arrays;

public class TaskNumber2 {
    // Создайте переменную для массива из 10 элементов (другим способом).
    // Заполните его произвольными значениями целочисленного типа и выведите на экран
    // элементы, стоящие на четных позициях.
    public static void main(String[] args) {
        System.out.println("В этом одномерном массиве");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (30 - 1 + 1) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nна четных позициях стоят следующие элементы:");

        for (int i = 0; i < array.length; i++)
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
    }
}



