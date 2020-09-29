import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController {
    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 3500; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();

        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }

        // Task 3.6

        System.out.println("=========Task 3.6============");
        Car car123 = new Car();

        car123.setNumber("1231231");
        car123.setHeight(1234);
        car123.setWeight(2000.);
        car123.setSpecial(false);
        car123.setVehicle(false);

        System.out.println("Number: " + car123.getNumber() + ", Height: " + car123.getHeight() + ", Weight: " + car123.getWeight()
                + ", isSpecial: " + car123.getSpecial() + ", hasVehicle: " + car123.getVehicle());
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        double weight = car.weight;
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        }
        else if (carHeight > passengerCarMaxHeight || weight > passengerCarMaxWeight) {
            if (car.hasVehicle) {
                price = cargoCarPrice + vehicleAdditionalPrice;
                System.out.println("Дополнительная плата с приеп - 200 руб.");
            } else {
                price = cargoCarPrice;
            }
        }
        else if (carHeight < passengerCarMaxHeight || weight > passengerCarMaxWeight) {
            if (car.hasVehicle) {
                price = cargoCarPrice + vehicleAdditionalPrice;
                System.out.println("Дополнительная плата с приеп - 200 руб.");
            }
            else {
                price = cargoCarPrice;
            }
        } else {
            price = passengerCarPrice;
        }

        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }


}