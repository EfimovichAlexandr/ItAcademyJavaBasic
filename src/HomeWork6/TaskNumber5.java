package HomeWork6;

import java.util.Scanner;

public class TaskNumber5 {
    // Введите с клавиатуры строку.
    // Напишите метод,выполняющий поиск в строке всех тегов абзацев, в том числе тех, у которых есть параметры,
    // например, <p id=”p1”>, и замену их на простые теги абзацев <p>. Результат работы метода выведите на экран.
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = line.nextLine();
        System.out.println(text.replaceAll("<.*?>", "<p>"));
    }
}
