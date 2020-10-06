import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите кол-во ящиков:");
        int box = Integer.parseInt(reader.readLine()); // Вводим с консоли кол-во ящиков

        int contPlusOne = (box % 27) != 0 ? 1 : 0;     // Смотрим нужен ли доп.контейнер (делится ли кол-во ящиков на 27 без остатка)
        int cont =  (box / 27) + contPlusOne;          // Считаем кол-во контейнеров

        int truckPlusOne = (cont % 12) != 0 ? 1 : 0;   // Смотрим нужен ли доп.грузовик
        int truck = (cont / 12) + truckPlusOne;        // Считаем кол-во грузовиков

        int contNum = 1; // Задаем изначальный номер контейнера и ящика.
        int boxNum = 1;


        for (int truckNum = 1; truckNum <= truck; truckNum++) {  // Три вложенных for. Первый нумерует грузовики
            System.out.println("Грузовик " + truckNum);          // Вывод на консоль номера грузовика
            for (int i = 0; i < cont; i++) {                     // for для контейнеров. Продолжается, пока int i < cont
                if (i == 12 || contNum > cont) break;            // Условие выхода из for. Как только i == 12 или contNum > cont
                System.out.println("\tКонтейнер " + contNum);    // Вывод на консколь номер контейнера
                contNum++;                                       // Увеличиваем contNum на 1 каждый шаг for
                for (int j = 0; j < box; j++) {                  // for для ящиков. Продолжается, пока j < box
                    if (j == 27 || boxNum > box) break;          // Условие выхода из for. Как только j == 27 ли boxNum > box
                    System.out.println("\t\tЯщик " + boxNum);    // Вывод на консоль кол-во ящиков
                    boxNum++;                                    // Увеличиваем boxNum на 1 каждый шаг for
                }
            }
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + truck + " шт.");
        System.out.println("контейнеров - " + cont + " шт.");
    }
}
