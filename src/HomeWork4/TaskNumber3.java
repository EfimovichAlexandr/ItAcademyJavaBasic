package HomeWork4;

public class TaskNumber3 {
    //Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
    public static void main(String[] args) {
        long number = 7893823445L;
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number != 0);
        System.out.println(sum);
    }
}
