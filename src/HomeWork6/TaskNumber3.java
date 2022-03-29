package HomeWork6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskNumber3 {
    /*
     Введите с клавиатуры текст.
     Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
    */
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = line.nextLine();
        StringBuilder wordEnd = new StringBuilder();
        Pattern pattern = Pattern.compile("([a-zA-Zа-яА-Я])\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            wordEnd.append(matcher.group());
        }
        System.out.println("Последние буквы всех слов из исходного текста: " + wordEnd);
    }
}

