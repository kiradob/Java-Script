package sem1;


public class java_sem5_task1 {
    /**
* Проверить, что 2 строки являются изоморфными в том смысле, что одну букву в первом слове можно заменить на какую-то во втором.
* Изоморфные строки имеют одинаковую длину.
* Примеры:
* (foo, bar) -> false f -> b, o -> a
* (paper, title) -> true p -> t, a -> i, e -> l, r -> e
* (egg, add) -> true e -> a, g -> d
* (abcde, bcdef) -> true a -> b, b -> c, c -> d, d -> e, e -> f
*/
    public static void main(String[] args) {

        System.out.println(isMatches("foo", "bar"));
        System.out.println(isMatches("paper", "title"));
        System.out.println(isMatches("egg", "add"));
        System.out.println(isMatches("abcde", "bcdef"));
    }

    private static boolean isMatches(String string, String string2) {
        if (string.length() != string2.length()) {
            return false;
        }
        char[] keyValue = new char[2];
        for (int i = 0; i < string.length(); i++) {
// Метод charAt() возвращает указанный символ из строки.
            if (keyValue[0] != string.charAt(i)) {
                keyValue[0] = string.charAt(i);
                keyValue[1] = string2.charAt(i);
            } else {
                if (keyValue[1] == string2.charAt(i)) {
                } else {
                    return false;
                }
            }

        }
        return true;
    }

}