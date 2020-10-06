import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        // Задаем переменную char space.
        char space = ' ';
        // n1 - индекс первого пробела в строке
        int n1 = name.indexOf(space);
        // n2 - индекс второго пробела в строке
        int n2 = name.lastIndexOf(space);

        System.out.println("Фамилия: " + name.substring(0, n1));     // Фамилия - с 0 индекса до n1
        System.out.println("Имя: " + name.substring(n1, n2).trim()); // Имя - от n1 до n2. Пробел(n1) отсекаем с помощью метода trim()
        System.out.println("Отчество: " + name.substring(n2).trim());// Отчество - от n2. Пробел(n2) отсекаем с помощью метода trim()
    }
}
