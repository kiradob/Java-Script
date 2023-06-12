package sem1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
 * проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */
public class java_sem5_DZ_task1 {
    public static void main(String[] args) {
        String pushkin = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        System.out.println(pushkin);
        collectStats(pushkin);

    }

    static void collectStats(String pushkin) {
        // Нужно сделать split, чтобы разделить текст на слова. Разделять будем по пробелам.
        String[] words = pushkin.split(" ");
        // Нужно создать HashMap для хранения слов и их длин
        // HashMap в Java работает по принципу хеширования. Это структура данных, которая позволяет сохранять объект 
        // и извлекать его за постоянное время O(1). При хешировании хеш-функции используются для связывания ключа и значения в HashMap.
        // Объекты сохраняются путем вызова метода put(key, value) HashMap и извлекаются путем вызова метода get(key).
        Map<String, Integer> wordLengths = new HashMap<>();

        // Заполнение массива
        for (String word : words) {
            wordLengths.put(word, word.length());
        }

        // Сортировка слов по длине
        String[] sortedWords = wordLengths.keySet().toArray(new String[0]);
        Arrays.sort(sortedWords, (a, b) -> wordLengths.get(a) - wordLengths.get(b));

        // Вывод сортированных слов
        for (int i = 0; i < sortedWords.length; i++) {

            if ((i >= 1) && (sortedWords[i - 1].length() != sortedWords[i].length())) {
                System.out.println();
                System.out.print(sortedWords[i] + ' ');
            } else {
                System.out.print(sortedWords[i] + ' ');
            }
        }

    }
}
