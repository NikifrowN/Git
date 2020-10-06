import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер карты в формате \"<первые 12 цифр> последние 4 цифры\"");
        String s = reader.readLine();

        System.out.println(searchAndReplaceDiamonds(s, "****"));
    }

    private static String searchAndReplaceDiamonds(String text, String placeholder) {

        int n1 = text.indexOf('>');

        return "Номер кредитной карты " + placeholder + " " + text.substring(n1 + 1).trim();
    }
}
