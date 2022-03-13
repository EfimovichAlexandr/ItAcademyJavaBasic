package BasicJava;

public class Main {
    public static void main(String[] args) {
        /*
        Написать код, который выведет значения переменных на экран:
        byte b = 0х55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char с = 'a' ;
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        */
        byte b = 0x55;
        System.out.println("byte b = " + b + ";");
        short s = 0x55ff;
        System.out.println("short s = " + s + ";");
        int i = 1000000;
        System.out.println("int i = " + i + ";");
        long l = 0xffffffffL;
        System.out.println("long l = " + l + ";");
        char c = 'a';
        System.out.println("char c = " + c + ";");
        float f = .25f;
        System.out.printf("float f = %.2f; \n", f);
        double d = .00001234;
        System.out.printf("double d = %.8f;\n", d);
        boolean bool = true;
        System.out.println("boolean = " + bool + ";");
        // Или так:
        System.out.printf("""
                               
                byte b = %d;
                short s = %d;
                int i = %d;
                long l = %d;
                char c = %c;
                float f = %.2f;
                double = %.8f;
                boolean bool = %s;""", b, s, i, l, c, f, d, bool);
        System.out.println("Голова кругом!");
    }
}
