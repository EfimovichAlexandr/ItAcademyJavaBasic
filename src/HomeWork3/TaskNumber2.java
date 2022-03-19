package HomeWork3;

import java.util.Scanner;

public class TaskNumber2 {
    /*
    Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
    Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
     */
    public static void main(String[] args) {
        Scanner sizes = new Scanner(System.in);
        System.out.print("Введите размеры прямоугольного оверстия:\na = ");
        int a = sizes.nextInt();
        if (a <= 0) {
            System.out.println("Размер должены быть больше нуля!\nПерезапустите программу и повторите ввод.");
        } else {
            System.out.print("b = ");
            int b = sizes.nextInt();
            if (b <= 0) {
                System.out.println("Размер должены быть больше нуля!\nПерезапустите программу и повторите ввод.");
            } else {
                System.out.print("Ведите радиус круглой картонки:\nr = ");
                int r = sizes.nextInt();
                if (r <= 0) {
                    System.out.println("Размер должены быть больше нуля!\nПерезапустите программу и повторите ввод.");
                } else if (r + r >= Math.sqrt(a * a + b * b)) {
                    System.out.println("Круглая картонка с радиусом " + r +
                            " закроет прямоугольное отверстие размерами " + a + " на " + b + ".");
                } else {
                    System.out.println("Круглая картонка с радиусом " + r +
                            " не закроет прямоугольное отверстие размерами " + a + " на " + b + ".");
                }
            }
        }
    }
}
