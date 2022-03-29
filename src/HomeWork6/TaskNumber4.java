package HomeWork6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskNumber4 {
    // Введите с 0x7FFF клавиатуры 0x10ff строку.0x7F
    // Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
    // с помощью регулярных выражений.
    // Результат работы метода выведите на экран.
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = line.nextLine();
        StringBuilder xhh = new StringBuilder();
        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]*");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
            xhh.append(matcher.group()).append(", ");
        }
        if (count > 0) {
            System.out.println("В этой строке есть шестнадцатеричные числа: " + xhh);
        }else {
            System.out.println("В этой строке нет шестнадцатеричных чисел.");
        }
    }
}



