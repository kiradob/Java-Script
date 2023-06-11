package sem1;

// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами 
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]

import java.util.ArrayList;
import java.util.List;

public class java_sem3_DZ_task2 {
    public static void main(String[] args) {

// Принятие значений
        ArrayList<String> list1 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        textList1(list1);
        System.out.println(list1);

    }

// Исключение - это нештатная ситуация, ошибка во время выполнения программы. Самый простой пример - деление на ноль. 
// Можно вручную отслеживать возникновение подобных ошибок, а можно воспользоваться специальным механизмом исключений, 
// который упрощает создание больших надёжных программ, уменьшает объём необходимого кода и повышает уверенность в том, 
// что в приложении не будет необработанной ошибки.
// Существует пять ключевых слов, используемых в исключениях: try, catch, throw, throws, finally. 
// https://developer.alexanderklimov.ru/android/java/exception.php

    private static void textList1(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            try {
// Функция parseInt преобразует первый переданный ей аргумент в строковый тип, интерпретирует его и возвращает целое число 
// или значение NaN. Результат (если не NaN) является целым числом и представляет собой первый аргумент (string), 
// рассматривающийся как число в указанной системе счисления (radix). 
// https://developer.mozilla.org/ru/docs/Web/JavaScript/Reference/Global_Objects/parseInt

                Integer.parseInt(array.get(i));
// Метод remove удаляет элемент из DOM. Применяется к элементу который нужно удалить.
                array.remove(i--);
            }
            catch (Exception e){}
        }
    }
}