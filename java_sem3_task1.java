package sem1;
// массив - имеет фиксированный размер, элемент можно обнулить, но удалить нельзя и добавить нельзя, 
// а arrayList - имеет динамический размер
// ArrayList -> List -> Collection -> Itarable
//               Set -> Collection
//    Deque -> Queue -> Collection
//    Deque - двухсторонняя очередь, в нее можно попасть сначала, а можно с конца
// ArrayList хранит внутри обыкновенный массив и следит за ним.



// Задание: из списка удалить повторяющиеся элементы. Порядок должен сохранится.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java_sem3_task1 {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 5, 3, 5, 6, 9, 11));
        System.out.println(integers);
        removeDuplicates(integers);
        System.out.println(integers);         // [1, 2, 3, 5, 6, 9, 11]

    }
// Метод removeDuplicates принимает лист
    private static void removeDuplicates(List<Integer> source) {

        List<Integer> duplicates = new ArrayList<>();
        // long a=System.currentTimeMillis();         // кол-во милисекунд, прошедших с 1 января 1970 года
        long a=System.nanoTime();  
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);
            if (!duplicates.contains(element)) {
                duplicates.add(element);
            } else {
                source.remove(i--);
            }
            i++;
        }
        // long b=System.currentTimeMillis();
        long b=System.nanoTime();  
        System.out.println(b-a);
// Удаление повторяющихся эементов
        // int i = 0;
        // while (i < source.size()) {
        //      int j = i + 1;
        //      while (j < source.size()) {
        //          if (source.get(i).equals(source.get(j))) {
        //              source.remove(j);
        //          }
        //          j++;
        //      }
        //  i++;
        // }
    }
}