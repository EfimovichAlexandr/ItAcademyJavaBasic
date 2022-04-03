package HomeWork5;

import java.util.Scanner;

public class TaskNumber2 {
    /*
    Создать класс описывающие Банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
    количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат.
    Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
    На экран – булевское значение (операция удалась или нет).
    При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
    Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
     */
    public static class ATM {
        private final int bill20 = 20;
        private final int bill50 = 50;
        private final int bill100 = 100;
        private int sumBill20;
        private int sumBill50;
        private int sumBill100;

        public ATM(int sumBill20, int sumBill50, int sumBill100) {
            setAddMoney(sumBill20, sumBill50, sumBill100);
        }

        public void setAddMoney(int sumBill20, int sumBill50, int sumBill100) {
            this.sumBill20 += sumBill20;
            this.sumBill50 += sumBill50;
            this.sumBill100 += sumBill100;
        }

        public void howMuchMoneyATM() {
            int sum = (bill20 * sumBill20 + bill50 * sumBill50 + bill100 * sumBill100);
            System.out.println("В банкомате находится: " + sum + " рублей.");
        }

        public void getTakeMoney() {
            System.out.println("В банкомате имеются купюры номиналом: 20, 50, 100. ");
            System.out.println("Какую сумму желаете снять?");
            Scanner money = new Scanner(System.in);
            int sumMoney = money.nextInt();
            int count100 = 0;
            int count50 = 0;
            int count20 = 0;
            int countAll;
            if (sumMoney > bill20 * sumBill20 + bill50 * sumBill50 + bill100 * sumBill100) {
                System.out.println("Операция не прошла.");
                System.out.println("В банкомате нет столько денег.");
            } else if (sumMoney % 10 != 0 || (sumMoney == 10 || sumMoney == 30)) {
                System.out.println("Операция не прошла.");
                System.out.println("В банкомате отсутствуют необходимые купюры.");
            } else {
                if (sumMoney % bill100 == 0) {
                    while (sumMoney != 0) {
                        if (sumBill100 > 0) {
                            sumMoney -= bill100;
                            count100++;
                            sumBill100--;
                        } else if (sumBill50 > 0) {
                            sumMoney -= bill50;
                            count50++;
                            sumBill50--;
                        } else if (sumBill20 > 0) {
                            sumMoney -= bill20;
                            count20++;
                            sumBill20--;
                        }
                    }
                } else if (sumMoney > bill100 && sumMoney % bill100 != 0 && sumMoney % bill50 == 0) {
                    count100 = sumMoney / bill100;
                    sumBill100 -= count100;
                    count50 = (sumMoney - count100 * bill100) / bill50;
                    sumBill50 -= count50;
                } else if ((sumMoney > bill100 && sumMoney % bill100 != 0 && sumMoney % bill20 == 0)) {
                    count100 = sumMoney / bill100;
                    sumBill100 -= count100;
                    count20 = (sumMoney - count100 * bill100) / bill20;
                    sumBill20 -= count20;
                } else if ((sumMoney > bill100 && sumMoney % bill100 != 0 && sumMoney % bill50 != 0 &&
                        sumMoney % bill20 != 0)) {
                    count100 = (sumMoney - 50) / bill100;
                    sumBill100 -= count100;
                    sumMoney = (sumMoney - count100 * bill100) - bill50;
                    count50++;
                    sumBill50--;
                    count20 = sumMoney / bill20;
                    sumBill20 -= count20;
                } else if (sumMoney < bill100 && sumMoney % bill20 == 0) {
                    count20 = sumMoney / bill20;
                    sumBill20 -= count20;
                } else {
                    count50 = sumMoney / bill50;
                    sumBill50 -= count50;
                    count20 = (sumMoney - count50 * bill50) / bill20;
                    sumBill20 -= count20;
                }
                countAll = count20 + count50 + count100;

                System.out.println("Операция завершена успешно.");
                System.out.println("Вы получили: " + countAll + " купюр, из них:");
                if (count100 > 0) {
                    System.out.println(count100 + " купюр по " + bill100 + " рублей.");
                }
                if (count50 > 0) {
                    System.out.println(count50 + " купюр по " + bill50 + " рублей.");
                }
                if (count20 > 0) {
                    System.out.println(count20 + " купюр по " + bill20 + " рублей.");
                }
            }
        }
    }

    public static void main(String[] args) {
        ATM bankEA = new ATM(100, 100, 100);
        bankEA.howMuchMoneyATM();
        bankEA.setAddMoney(100, 100, 100);
        bankEA.howMuchMoneyATM();
        bankEA.getTakeMoney();
        bankEA.howMuchMoneyATM();
    }
}







