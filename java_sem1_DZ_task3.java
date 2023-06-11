package sem1;

import java.util.Random;
public class java_sem1_DZ_task3 {
    // 3. Создать квадратный двумерный целочисленный массив (количество строк и
    // столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
    // элементы единицами.
    public static void main(String[] args) {
        Replace1Array();
    }
    public static void Replace1Array() {
        Random random = new Random();
        int[][] array = new int[3][3];
        System.out.println("Требуется заполнить диагональные элементы матрицы цифрой 1");
        System.out.println("Входной массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(2, 9);
            }
        }


        System.out.println("Итоговый массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
