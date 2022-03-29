package HomeWork6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskNumber1 {
    /*
    Введите с клавиатуры строку.
    Найти в строке не только запятые, но и другие знаки препинания.
    Подсчитать общее их количество.
     */
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = line.nextLine();
        Pattern pattern = Pattern.compile("(\\.{3}|(?<!\\.)\\.(?!\\.)|[-!,?:()\"])");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("В этой строке " + count + " знака(ов) препинания.");

    }
}

