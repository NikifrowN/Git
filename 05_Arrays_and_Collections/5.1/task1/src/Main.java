public class Main {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";

        String[] colors = text.split(",?\\s+");
        int n = colors.length;
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = colors[n - 1 - i];
            colors[n - 1 - i] = colors[i];
            colors[i] = temp;
        }
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
