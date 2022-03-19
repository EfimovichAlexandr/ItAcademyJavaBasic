package HomeWork4_Arrays;

public class TaskNumber1 {
    // Создайте переменную для массива из 10 элементов.
    // Заполните его произвольными значениями целочисленного типа и
    // выведите последний элемент массива на экран.
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println(array[9]);
        // Или
        System.out.println(array[array.length-1]);
    }
}
