import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        System.out.println("Чего бы приготовить? Посмотрим, что есть из продуктов");


// Вводим кол-во продуктов с консоли
        Scanner in = new Scanner (System.in);
        System.out.println("Сколько молока? (мл)");
        int milkAmount = in.nextInt();
        System.out.println("Сколько муки? (г)");
        int powderAmount = in.nextInt();
        System.out.println("Сколько яиц? (шт)");
        int eggsCount = in.nextInt();
        System.out.println("Сколько сахара? (г)");
        int sugarAmount = in.nextInt();
        System.out.println("Сколько масла? (мл)");
        int oilAmount = in.nextInt();
        System.out.println("Сколько яблок? (шт)");
        int appleCount = in.nextInt();
        System.out.println("Какие на сегодня перспективы:");
        //блины
        int milkP = 1000, powderP = 400, sugarP = 10, oilP = 30;
        boolean pancakeIsGood = false;

        if (milkAmount >= milkP && powderAmount >= powderP && sugarAmount >= sugarP && oilAmount >= oilP) {
            System.out.print("Нажарим блинов, ");
            pancakeIsGood = true;
        }
        else {
            System.out.print("Блинов не буде, ");
        }
        //омлет
        int milkO = 300, powderO = 5, eggsO = 5;
        boolean omletteIsGood = false;

        if (milkAmount >= milkO && powderAmount >= powderO && eggsCount >= eggsO) {
            System.out.print("бахнем омлет, ");
            omletteIsGood = true;
        }
        else {
            System.out.print("на омлет не хватит, ");
        }
        //яблочный пирог

        int applesAP = 3, milkAP = 100, powderAP = 300, eggsAP = 4;
        boolean applePieIsGood = false;

        if (appleCount >= applesAP && milkAmount >= milkAP && powderAmount >= powderAP && eggsCount >= eggsAP) {
            System.out.println("испечём яблочный пирог.");
            applePieIsGood = true;
        }
        else {
            System.out.println("сегодня без пирога.");
        }

        //Подводим итог

        if (applePieIsGood || omletteIsGood || pancakeIsGood) {
            System.out.println("Весьма неплохо.");
        }
        else {
            System.out.println("Завтра поем тогда.");
        }


    }
}