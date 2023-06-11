package sem1;

import java.util.ArrayList;
// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

public class java_sem3_DZ_task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Cписок произвольных чисел: " + numbers);
        numbers.removeIf(x -> (x % 2) != 0);;
        System.out.println("Готовый список, где удалены нечётные числа: " + numbers);
    }
}