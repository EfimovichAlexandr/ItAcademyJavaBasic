package HomeWork6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskNumber2 {
    // Введите с клавиатуры текст.
    // Подсчитать количество слов в тексте.
    // Учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы,
    // но могут и отсутствовать.
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = line.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("В этом тексте " + count + " слов(а).");
    }
}
