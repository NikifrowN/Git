public class Main {

    public static void main(String[] args) {

        String enAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < enAlphabet.length(); i++) {
            System.out.println(enAlphabet.charAt(i) + " code - " + (int) enAlphabet.charAt(i));
        }

        String ruAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        for (int i = 0; i < ruAlphabet.length(); i++) {
            System.out.println(ruAlphabet.charAt(i) + " code - " + (int) ruAlphabet.charAt(i));
        }
    }
}
