package sem1;

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"


public class java_sem2_DZ_task1 {
    public static void main(String[] args) {
        System.out.println(characterString(8, 'a', 'b'));
    }
    private static String characterString(int n, char c1, char c2) {  
    // Если в программе нужны символы, то пользуемся типом данных char.
        String с = "" + c1 + c2;
        if (n <= 0) {
            return "Ошибка";}
        if (n % 2 != 0) {
            return с.repeat(n/2) + c1;}
        return с.repeat(n/2);
    }
}
