import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //    while (true) {
    //        System.out.println("Введите ФИО");
    //       String text = reader.readLine();

    //        String[] name = text.split(" ");
    //        boolean surname = name[0].matches("[А-ЯЁ][а-яё]+");
    //        boolean firstName = name[1].matches("[А-ЯЁ][а-яё]+");
    //        boolean patronymic = name[2].matches("[А-ЯЁ][а-яё]+");

    //        if (name.length != 3 | !(surname & firstName & patronymic)) {
    //            System.out.println("Некорректное имя");
    //        }
    //        else {
    //            System.out.println("Фамилия: " + name[0]);
    //            System.out.println("Имя: " + name[1]);
    //            System.out.println("Отчество: " + name[2]);
    //            break;
    //        }
    //    }

        while (true) {
            System.out.println("Введите ФИО");
            String text = reader.readLine();
            String[] name = text.split(" ");

            boolean surname = Character.isUpperCase(name[0].charAt(0));
            boolean firstName = Character.isUpperCase(name[1].charAt(0));
            boolean patronymic = Character.isUpperCase(name[2].charAt(0));

            if (name.length == 3 & (surname & firstName & patronymic)) {
                for (int i = 0; i < name.length; i++) {

                }
            }
        }
    }
}
