package sem1;

public class java_sem1_DZ_task2 {
    // 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
    // циклом, и числа меньшие 6 умножить на 2;

    public static void main(String[] args) {
        mult2Array();
    }
    public static void mult2Array() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Требуется числа в массиве, кторые меньшие 6 умножить на 2");
        System.out.print("Входной массив:  ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.out.println();
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] = array[i] * 2;
        System.out.print("Итоговый массив: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.out.println();
    }

}
