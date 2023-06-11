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
// Поиск самой короткой строки
    static String findCommonPrefix(String[]array){
// Берем первую строку за эталонную
        String shortString=array[0];
// Длины всех остальных строк мя сравниваем с длиной первой lenght
        for(int i=1;i<array.length; i++){
            if (array[i].length()<shortString.length()){
                shortString=array[i];
// По итогу мы имеем самую короткую строку из всех
            }
        }
        String result="";
// Мы бежим по всем индексам от 0 до длины самой короткой строки lenght
// сравниваем конкретные символы через индексы с такими же индексами в других строках
        first: for (int index=0; index<shortString.length();index++){
            char firstIndexChar=shortString.charAt(index);
            for (int i=1;i<array.length; i++){


                char secondStringChar=array[i].charAt(index);
// Если в каких-то строках например 10-й индекс не совпал, значит это уже не общий префикс, поэтому мы останавливаем все и выходим
                if (firstIndexChar!=secondStringChar){
                    break first;
                }
            }
// Если какой-то индекс идентичен во всех строках, то мы его записываем в наш результат
            result+=shortString.charAt(index);
        }
        return result;
    }
}