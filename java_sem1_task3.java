package sem1;



// Напишите метод, который находит самую длинную строку общего префикса среди всех строк массива.
// Если общего префикса нет, вернуть пусую строку.
public class java_sem1_task3 {
    public static void main(String[] args) {
        String[]array={"Скажи-ка, дядя, ведь недаром_abc","Скажи-ка, дядя, ведь недаром_abcdef","Скажи-ка, дядя, ведь недаром_abcqqqqq","Скажи-ка, дядя, ведь недаром_abcee"}; 
        // общий префикс "Скажи-ка, дядя, ведь недаром_abc"
        String CommonPrefix=findCommonPrefix(array);
        System.out.println(CommonPrefix);
    }

    static String findCommonPrefix(String[]array){
        String first=array[0];
        for(int i=1;i<array.length; i++){
            if (first.length()>array[i].length()){
                first=array[i];
            }
        }
        String result="";
        first: for (int index=0; index<first.length();index++){
            char firstIndexChar=first.charAt(index);
            for (int i=1;i<array.length; i++){


                char secondStringChar=array[i].charAt(index);

                if (firstIndexChar!=secondStringChar){
                    break first;
                }
            }
            result+=first.charAt(index);
        }
        return result;
    }
}