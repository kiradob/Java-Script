package sem1;
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
public class java_sem1_task1 {
    public static void main(String[] args) {
        int[] array={1,0,1,1,1,1};
        // int[] y=new int [10];
        // System.out.println(array[2]);
        // System.out.println(y[2]);

        int curr=0;
        int best=0;
        for(int i=0;i<array.length;i++){
            int a=array[i];
            if (a==1){
                curr=curr+1;
            }else{
                if (curr>best){
                    best=curr;
                }
                curr=0;
            }
        }
        if (curr>best){
            best=curr;
        }
         
        
        System.out.println(best);
    }
        // for(int a:array){

        // }
}