
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей, май нэйм из Паша ай лив ин Раша 40000000";
        String[] s = text.split(", ");
        int sum = 0;

        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replaceAll("[^0-9]", "");
            sum += Integer.parseInt(s[i]);
        }
        System.out.println(sum);
    }
}