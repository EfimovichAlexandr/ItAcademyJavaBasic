package HomeWork4_Arrays;

public class TaskNumber6 {
    // Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
    //1 1 1 1 1
    //0 1 1 1 0
    //0 0 1 0 0
    //0 1 1 1 0
    //1 1 1 1 1
    public static void main(String[] args) {
        System.out.println("Двухмерный квадраный массив \"Бабочка\":");
        int[][] dualArray = {{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        for (int[] i : dualArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        } // Примитивно, но условие задачи выполнено))
    }
}