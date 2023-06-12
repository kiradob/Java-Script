package sem1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class java_sem4_task1 {

    public static final int SIZE = 5_000_000;

    public static void main(String[] args) {
        Integer[] data = createInitialArray(SIZE);

        ArrayList<Integer> arrayList = createArrayList(data);
        LinkedList<Integer> linkedList = createLinkedList(data);

        long arrayListTimer = timer(arrayList);
        long linkedListTimer = timer(linkedList);

        System.out.println("ArrayList: " + arrayListTimer);
        System.out.println("LinkedList: " + linkedListTimer);
    }

    private static Integer[] createInitialArray(int size) {
        Integer[] data = new Integer[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = ThreadLocalRandom.current().nextInt(1000);
        }
        return data;
    }
// Метод: лист, который будет измерять вставку
    static long timer(List<Integer> list) {
        long start = System.currentTimeMillis();
        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     iterator.next();
        // }
        for (int i=0;i<10000; i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    static ArrayList<Integer> createArrayList(Integer[] data) {
        return new ArrayList<>(List.of(data));
    }

    static LinkedList<Integer> createLinkedList(Integer[] data) {
        return new LinkedList<>(List.of(data));
    }

}