public class Cycle {

    public static void main(String[] args) {

        int ticket = 0;

        for (ticket = 200000; ticket <=235000; ticket++) {
            if (ticket <= 210000) {
                System.out.println("Ticket number from 200k to 210k: " + ticket);
            }
            if (ticket >= 220000) {
                System.out.println("Ticket number from 220k to 235k: " + ticket);
            }
        }
    }
}



