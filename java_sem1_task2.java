package sem1;
import java.util.Arrays;

    
// Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все) элементов 
// массива должны быть отличны от заданного, а остальные - равны ему.
public class java_sem1_task2 {
    public static void main(String[] args) {
        int[] array={3,2,2,2,1,5,3,2,3};
        System.out.println(Arrays.toString(array));
        int val = 3;
        swap(array,val);
        System.out.println(Arrays.toString(array));
        // for (int x:array){
        //     System.out.print(x+" ");
        // }
    }

        // Метод, который принимает массив и число и в массиве делает операцию
    static void swap(int[] array, int val){
        int size=array.length;
        int shift=1;
        for (int i=0; i<size && i<size-shift; i++){
            while (array[size-shift]==val){
                shift++;
            }
            if (array[i]==val){
                int tmp=array[i];
                // Поменяем i-й и последний элементы:
                array[i]=array[size-shift];
                array[size-shift]=tmp;
                shift++;
                System.out.println();
            }                
        }
    }    
}