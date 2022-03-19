package HomeWork4;

public class TaskNumber6 {
    // Задать произвольное целое число и вывести его в бухгалтерском формате,
    // то есть, начиная справа, каждые три позиции отделяются пробелом.
    // Например, число 20023143 должно быть выведено как 20 023 143.
    public static void main(String[] args) {

        int number = 20023143;
        System.out.printf("%,d", number);
    }
}
