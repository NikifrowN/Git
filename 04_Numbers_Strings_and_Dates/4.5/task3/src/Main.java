import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        String[] name = text.split(" ");
        
        System.out.println("Фамилия: " + name[0]);
        System.out.println("Имя: " + name[1]);
        System.out.println("Отчество: " + name[2]);
    }
}
