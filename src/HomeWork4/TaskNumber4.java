package HomeWork4;

public class TaskNumber4 {
    // Найти среди чисел от 50 до 70 второе простое число
    // (число называют простым,если оно делится без остатка только на 1 и себя)
    // и завершить цикл с использованием break.
    public static void main(String[] args) {
        int count = 0;
        for (int i = 50; i <= 70; i++) {
            count++;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    i++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                break;
            }
        }
    }
}
