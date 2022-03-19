package HomeWork4_Arrays;

public class TaskNumber5 {
    // Создайте переменную для массива из 10 элементов.
    // Заполните его произвольными значениями целочисленного типа.
    // Выведите на экран, переверните и снова выведите на экран
    // (при переворачивании нежелательно создавать еще один массив).
    public static void main(String[] args) {
        System.out.println("Это одномерный массив:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (100 - 10 + 1) + 10);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nА это тот же массив, но в обратном порядке.");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
