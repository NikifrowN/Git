import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ФИО");
            String text = scanner.nextLine();

            if (!isGoodName(text)) {
                System.out.println("Неправильный ввод");
            }
            else {
                text = text.trim();
                int s1 = text.indexOf(' ');                   // Индекс первого пробела
                int s2 = text.indexOf(' ', s1 + 1);  // Это индекс второго пробела, чтобы точно отделить фамилию

                String surname = text.substring(0, s1);
                String firstName = text.substring(s1, s2).trim();
                String patronymic = text.substring(s2).trim();       // В отчество улетает всё после второго пробела

                boolean correctSurnameAndFirstName = isLettersAndCapitals(surname) & isLettersAndCapitals(firstName);
                boolean correctDoubleName = (isDoubleName(surname) & isDoubleName(firstName)) | (isDoubleName(surname) && isLettersAndCapitals(firstName)) | (isDoubleName(firstName) & isLettersAndCapitals(surname));

                if (patronymic.contains(" ")) {                                // Это на случай, если в строке больше 3 слов
                    if (isDoublePatronymic(patronymic)) {                      // Проверка через метод isDoublePatronymic
                        if  (correctSurnameAndFirstName | correctDoubleName) { // Здесь проверка на двойное имя и соответствие имени условию (первая заглавная, остальные строчные, только буквы)
                            System.out.println("Фамилия: " + surname + "\nИмя: " + firstName + "\nОтчество: " + patronymic);
                            break;
                        }
                        else System.out.println("Неправильный ввод");
                    }
                    else System.out.println("Неправильный ввод");
                }
                else { //Тут если 3 слова. Опять проверяем на соответсвие условию и двойные имена.
                    if (isLettersAndCapitals(patronymic)) {
                        if (correctSurnameAndFirstName | correctDoubleName) {
                            System.out.println("Фамилия: " + surname + "\nИмя: " + firstName + "\nОтчество: " + patronymic);
                            break;
                        }
                        else System.out.println("Неправильный ввод");
                    }
                    else System.out.println("Неправильный ввод");
                }
            }
        }
    }
    public static boolean isLettersAndCapitals(String string) {
        char[] letters = string.toCharArray(); // Создаём массив из символов строки.
        int capitalCounter = 0;
        if (Character.isUpperCase(letters[0])) { // Проверяем, чтобы первая буква была заглавной
            // Через цикл прогоняем все символы. Все символы должны быть буквами, и должна быть только одна заглвная
            for (char i : letters) {
                boolean letter = Character.isLetter(i);
                boolean capital = Character.isUpperCase(i);
                if (capital) {
                    capitalCounter++;
                }
                if (!letter | capitalCounter > 1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static boolean isGoodName(String string) {
        int s11 = string.indexOf(' ');
        if (string.trim().contains(" ")) {
            return string.substring(s11).trim().contains(" ");
        }
        return false;
    }

    public static boolean isDoubleName(String string) { // Если в имени есть "-", метод делит строку на две части и проверяет части на соответствие условию.
        char dash = '-';
        if (string.contains("-")) {
            int dashSplitter = string.indexOf(dash);
            String firstPart = string.substring(0, dashSplitter);
            String secondPart = string.substring(dashSplitter + 1);
            return isLettersAndCapitals(firstPart) & isLettersAndCapitals(secondPart);
        }
        return false;
    }
    public static boolean isDoublePatronymic(String string) {  // Короче метод делит строку на пробелы и на "оглы кызы". Если пробел не один, то возвращает false
        char space = ' ';
        if ((string.contains("оглы") | string.contains("кызы")) & string.indexOf(space) == string.lastIndexOf(space)) {
            int spaceSplitter = string.indexOf(space);
            String firstPart = string.substring(0, spaceSplitter).trim();
            return isLettersAndCapitals(firstPart); //Здесь отделили первое слово отчества и проверяем, чтоб была первая заглавная, остальные строчные, и были только буквы
        }
        return false;
    }
}
