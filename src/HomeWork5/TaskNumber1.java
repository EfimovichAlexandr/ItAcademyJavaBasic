package HomeWork5;

public class TaskNumber1 {
    /*Создать класс описывающие промежуток времени.
     Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
     Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
     (метод должен работать аналогично compareTo в строках).
     Создать два конструктора: получающий общее количество секунд получающий часы, минуты и секунды по отдельности.
     Сделать метод для вывода данных. Прочее на ваше усмотрение.
     */
    public static class TimeInterval {
        private int seconds;
        private int minutes;
        private int hours;

        public TimeInterval(int seconds, int minutes, int hours) {
            System.out.println("Создан объект!");
            setWatch(seconds, minutes, hours);
        }

        public TimeInterval(int seconds) {
            System.out.println("Создан объект!");
            setWatchSec(seconds);
              }

        public void setWatch(int seconds, int minutes, int hours) {
            this.seconds = seconds;
            this.minutes = minutes;
            this.hours = hours;
        }

        public void setWatchSec(int seconds) {
            this.seconds = seconds;
        }

        public void textInfo() {
            System.out.println("Секунд: " + seconds + "; Минут: " + minutes + "; Часов: " + hours + ".");
            System.out.println("В этом объекте полное количество секунд равно: " + getWatch());
        }

        public void textInfo2() {
            System.out.println("Секунд: " + seconds);
            System.out.println("Это количество секунд равняется: " + getWatchSec());
        }

        public String getWatch() {
            int sumSeconds = seconds + minutes * 60 + hours * 3600;
            return sumSeconds + "\n";
        }

        public String getWatchSec() {
            int sumHours = seconds / 3600;
            int sumMinutes = (seconds - sumHours * 3600) / 60;
            int sumSeconds = seconds - (sumHours * 3600) - (sumMinutes * 60);
            return "Часов: " + sumHours + "; Минут: " + sumMinutes + "; Секунд: " + sumSeconds + "\n";
        }


        public int compareTo(TimeInterval o) {
            int hoursComp = Integer.compare(hours, o.hours);
            if (hoursComp != 0) {
                return hoursComp;
            }
            int minutesComp = Integer.compare(minutes, o.minutes);
            if (minutesComp != 0) {
                return minutesComp;
            }
            return Integer.compare(seconds, o.seconds);
        }
    }

    public static void main(String[] args) {
        TimeInterval one = new TimeInterval(500, 10, 1);
        one.textInfo();

        TimeInterval two = new TimeInterval(1000, 15, 2);
        two.textInfo();
        System.out.println(one.compareTo(two));

        TimeInterval oneSec = new TimeInterval(9100);
        oneSec.textInfo2();

        TimeInterval twoSec = new TimeInterval(4700);
        twoSec.textInfo2();
        System.out.println(oneSec.compareTo(twoSec));
    }
}

