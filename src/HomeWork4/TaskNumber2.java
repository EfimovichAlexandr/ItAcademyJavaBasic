package HomeWork4;

public class TaskNumber2 {
    // Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
    public static void main(String[] args) {
        int a = 1;
        long multiply = 1;
        do {
            multiply *= a;
            a++;
        } while (a <= 25);
        System.out.println("Произведение чисел от 1 до 25 равно: " + multiply);
    }
}
