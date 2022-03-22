package HomeWork4_Arrays;

import java.util.Scanner;

public class TaskNumber6 {
    // Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
    //1 1 1 1 1
    //0 1 1 1 0
    //0 0 1 0 0
    //0 1 1 1 0
    //1 1 1 1 1
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.print("Для создания двухмерного квадраного массива \"Бабочка\"\nвведите размер стороны квадрата: ");
        int size = array.nextInt();
        int[][] dualArray = new int[size][size];
        for (int i = 0; i < dualArray.length / 2; i++) {
            for (int j = 0; j < dualArray[i].length; j++) {
                if (j < i || j >= dualArray[i].length - i)
                    dualArray[i][j] = 0;
                else
                    dualArray[i][j] = 1;
            }
        }
        for (int i = dualArray.length - 1; i >= dualArray.length / 2; i--) {
            for (int j = 0; j < dualArray[i].length; j++) {
                if (j < dualArray[i].length - 1 - i || j > i)
                    dualArray[i][j] = 0;
                else
                    dualArray[i][j] = 1;
            }
        }
        for (int[] ints : dualArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

