package HomeWork4;

public class TaskNumber1 {
    // Вычислить факториал целых чисел от 0 до 10 с помощью цикла while.
    public static void main(String[] args) {

        int a = 0;
        long factorialNumbers = 0;
        while (a <= 10) {
            if (a == 0){
                factorialNumbers++;
                a++;
                continue;
            }
            factorialNumbers *= a;
            a++;
        }
        System.out.println("Факториал целых чисел от 0 до 10 равен: " + factorialNumbers);
    }
}


