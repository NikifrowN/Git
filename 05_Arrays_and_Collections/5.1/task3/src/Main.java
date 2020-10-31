public class Main {
    public static void main(String[] args) {
        char x = 'X';
        char s = ' ';

        char[][] cross = new char[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j  || i == 6 - j) {
                    cross[i][j] = x;
                } else cross[i][j] = s;
            }
            System.out.println(cross[i]);
        }
    }
}
