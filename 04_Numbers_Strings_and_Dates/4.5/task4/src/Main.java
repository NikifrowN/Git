import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        String phoneNumber = text.replaceAll("[^0-9]", "");

        if (phoneNumber.length() != 11) {
            System.out.println("Неверный формат номера");
        }
        else if (phoneNumber.charAt(0) == '8') {
            System.out.println(7 + "" + phoneNumber.substring(1));
        }
        else if (phoneNumber.charAt(0) != '7') {
            System.out.println("Неверный формат номера");
        }
        else {
            System.out.println(phoneNumber);
        }
    }
}
