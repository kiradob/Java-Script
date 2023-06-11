package sem1;

import java.util.Arrays;


public class java_sem1_DZ_task0 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false


        printString("Hey,Kira!", 2); // Hey,Kira!Hey,Kira!

        System.out.println(isLeapYear(2023)); // true
        System.out.println(Arrays.toString(createArray(5, 2)));
          
    }
     
        

/**
 * 0. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
    // 0.1 Проверить, что сумма a и b лежит между 10 и 20:

    private static boolean isSumBetween10And20(int a, int b) {
        if ((a + b <= 20) && (a + b >= 10)) {
            return true;
        }
        return false;
    }

        // 0.2 Проверить, что х положительное:

    private static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

        // 0.3. Напечатать строку source repeat раз:

    private static void printString(String source, int repeat) {
        System.out.println(source.repeat(repeat));
    }

        // 0.4 Проверить, является ли год високосным. если да - return true

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 == 0) {
            if (year % 400 == 0)
                return true;
            else
                return false;
        } else {
            return true;
        }
    }
        // 0.5. Должен вернуть массив длины len, каждое значение которого равно initialValue
    private static int[] createArray(int len, int initalValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initalValue;
        }
        return array;
    }
}