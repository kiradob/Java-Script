package sem1;

import java.util.ArrayList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text-num
// 2. Нужно рассплитить строку по -, сохранить text в связный список на позицию num.
// 3. Если введено print-num, выводит строку из позиции num в связном списке.
// 4. Если введено exit, завершаем программу

// Пример:
// string-4
// num-3
// print-3
// num
// print-4
// string
// my_value-1
// print-1
// my_value

public class java_sem4_DZ_task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку и номер этой строки под которым её сохранить через дефис (-): ");
        System.out.println("Чтобы вывести это строку введите сочетание print-№строки");
        System.out.println("Для выхода введите слово: exit");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>();
        while (true) {
            String text = sc.nextLine();
// Исключение - это нештатная ситуация, ошибка во время выполнения программы. Самый простой пример - деление на ноль. 
// Можно вручную отслеживать возникновение подобных ошибок, а можно воспользоваться специальным механизмом исключений, 
// который упрощает создание больших надёжных программ, уменьшает объём необходимого кода и повышает уверенность в том, 
// что в приложении не будет необработанной ошибки.
// Существует пять ключевых слов, используемых в исключениях: try, catch, throw, throws, finally. 
// https://developer.alexanderklimov.ru/android/java/exception.php
            try {
                if (text.equals("exit")) {
                    break;
                }
                Integer.parseInt(text.split("-")[1]);
            } catch (Exception e) {
                System.out.println("Данные введены некорректно!");
            }
            String[] consData = text.split("-");
// Функция parseInt преобразует первый переданный ей аргумент в строковый тип, интерпретирует его и возвращает целое число 
// или значение NaN. Результат (если не NaN) является целым числом и представляет собой первый аргумент (string), 
// рассматривающийся как число в указанной системе счисления (radix). 
// https://developer.mozilla.org/ru/docs/Web/JavaScript/Reference/Global_Objects/parseInt
            int num = Integer.parseInt(consData[1]);
            int localSize = num - listData.size();
// При вводе строки, на которой ничего не сохранено выводится null
            for (int i = 0; i <= localSize; i++) {
                listData.add(null);
            }
            if (consData[0].equals("print")) {
                System.out.println(listData.get(num));
            } else {
                listData.set(num, consData[0]);
            } 
        }
    }
}