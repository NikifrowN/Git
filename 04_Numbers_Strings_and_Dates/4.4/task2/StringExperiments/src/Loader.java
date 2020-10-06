
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        // Задаём индексы строк "заработал " и " рублей,"
        int v1 = text.indexOf("заработал ");
        int v2 = text.indexOf(" рублей,");
        // Отсекаем "заработал" и преобразуем в число
        int vasyaNum = Integer.parseInt(text.substring(v1 + 10, v2));

        // Тоже самое
        int p1 = text.indexOf("Петя - ");
        int p2 = text.indexOf(" рубля,");
        int petyaNum = Integer.parseInt(text.substring(p1 + 7, p2));

        // Тут используем lastIndexOf, т.к. "рублей" уже было в строке.
        int m1 = text.indexOf("Маша - ");
        int m2 = text.lastIndexOf(" рублей");
        int mashaNum = Integer.parseInt(text.substring(m1 + 7, m2));

        System.out.println(vasyaNum + petyaNum + mashaNum);
    }
}