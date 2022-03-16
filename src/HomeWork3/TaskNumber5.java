package HomeWork3;

import java.util.Scanner;

public class TaskNumber5 {
    /*
    Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
    Проверить, помещаются ли эти дома на данном участке. Стороны домов – параллельны сторонам участка,
    в остальном размещение может быть любым.
    */
    public static void main(String[] args) {
        Scanner houses = new Scanner(System.in);
        System.out.print("Введите размеры первого дома:\na = ");
        int a = houses.nextInt();
        System.out.print("b = ");
        int b = houses.nextInt();
        System.out.print("Введите второго дома:\nс = ");
        int c = houses.nextInt();
        System.out.print("d = ");
        int d = houses.nextInt();
        System.out.print("Введите размеры участка на котором будут распологаться дома:\ne = ");
        int e = houses.nextInt();
        System.out.print("f = ");
        int f = houses.nextInt();
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0 || e <= 0 || f <= 0) {
            System.out.println("Все размеры должны быть больше нуля!\nПерезапустите программу и повторите ввод");
        } else if (a + c <= e && b <= f && d <= f) {
            System.out.println("1) Дома с размерами " + a + "х" + b + " и " + c +
                    "х" + d + " помещаются на участке " + e + "х" + f + ".");
        } else if (a + d <= e && b <= f && c <= f) {
            System.out.println("2) Дома с размерами " + a + "х" + b + " и " + c +
                    "х" + d + " помещаются на участке " + e + "х" + f + ".");
        } else if (b + d <= f && a <= e && c <= e) {
            System.out.println("3) Дома с размерами " + a + "х" + b + " и " + c +
                    "х" + d + " помещаются на участке " + e + "х" + f + ".");
        } else if (b + c <= f && a <= e && d <= e) {
            System.out.println("4) Дома с размерами " + a + "х" + b + " и " + c +
                    "х" + d + " помещаются на участке " + e + "х" + f + ".");
        } else {
            System.out.println("Дома с размерами " + a + "х" + b + " и " + c +
                    "х" + d + " не помещаются на участке " + e + "х" + f + ".");
        }
    }
}