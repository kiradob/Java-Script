
// Создать файл с названием file.txt. Если файл уже есть, то создавать не надо.
// Записать в него Слово "TEXT" 100 раз

package sem1;

import java.io.*;
import java.util.Scanner;

public class java_sem2_DZ_task2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text = "TEXT\n";  // \ использую, чтобы можно было посчитать количество
        int count = 100;          
        in.close();
        try { //создание файла java_sem2_DZ2.txt или сбщ, что файл уже есть
            File java_sem2_DZ2 = new File("D:\\Kira\\Обучение Python\\!! четверть\\2. Java Script\\Java projects\\sem1\\java_sem2_DZ2.txt");
            if (java_sem2_DZ2.createNewFile())
                System.out.println("Файл создан.");
            else
                System.out.println("Такой файл уже есть в папке.");
        } 
        catch (Exception e) {
            System.err.println(e);
        }
        // запись
        try (FileWriter writer = new FileWriter("D:\\Kira\\Обучение Python\\!! четверть\\2. Java Script\\Java projects\\sem1\\java_sem2_DZ2.txt", false)) {
            writer.write(text.repeat(count));
            System.out.println("Текст записан.");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}