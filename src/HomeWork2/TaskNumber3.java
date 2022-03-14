package HomeWork2;

import java.util.Scanner;

public class TaskNumber3 {
    public static void main(String[] args) {
        /*Задать промежуток времени в секундах в виде переменной. Следует вывести
         его на экран в виде часов минут и секунд, суток и недель.
         */
        Scanner time = new Scanner(System.in);
        System.out.print("Введите промежуток воемени в секундах: ");
        int howManySeconds = time.nextInt();
        if (howManySeconds <= 0) {
            System.out.println("Вы ввели не верное число");
        } else {
            int timeInHours = howManySeconds / 3600;
            int timeInMinutes = ((howManySeconds - timeInHours * 3600) / 60);
            int timeInSeconds = howManySeconds - timeInHours * 3600 - timeInMinutes * 60;
            float timeInDays = (float) howManySeconds / 86400;
            float timeOfWeeks = timeInDays / 7;
            System.out.println("Это: " + timeInHours + " часа(ов), " + timeInMinutes + " минут(а), " +
                    timeInSeconds + " секунд(а).");
            System.out.printf("Или: %.2f сутки(ок). " + "\nИли %.2f недель(я).", timeInDays, timeOfWeeks);
        }
    }
}

