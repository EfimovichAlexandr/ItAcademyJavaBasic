package HomeWork6;

public class TaskNumber6 {
    /*
    Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
    один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
    Сравните скорость их выполнения. Выведите сравнение на экран.
     */
    public static void main(String[] args) {
        String form = "aaabbbccc";
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 1000000; i++) {
            String sumForm = form + form;
        }
        System.out.println("string+ выполнил миллион сложенеий за: " + (System.currentTimeMillis() - start) + "ms");

        StringBuilder builder = new StringBuilder();
        start = System.currentTimeMillis();
        builder.append(form.repeat(1000001));
        System.out.println("Stringbuilder выполнил миллион сложенеий за: " + (System.currentTimeMillis() - start) + "ms");
    }
}


