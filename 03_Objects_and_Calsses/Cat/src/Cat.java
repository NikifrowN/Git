
public class Cat {

    //.....Переменные класса.
    private double originWeight;   // Переменная изначальный вес.
    private double weight;         // Переменная вес.
    private double food;           // Переменная количество корма.
    private boolean alive;         // Булиан "кошка жива".
    private HairColour colour;     // Цвет
    private String name;           // Имя
    private static int count;      // Счётчик обектов
    //.....Константы класса.
    public final double MIN_WEIGHT = 1000.0;      // Задаём константу минмальный вес.
    public final double MAX_WEIGHT = 9000.0;      // Задаём константу максимальный вес.
    public final int EYES_COUNT = 2;              // Задаём константу кол-во глаз.

    public Cat() {                                // Объект кошка.
        weight = 1500.0 + 3000.0 * Math.random(); // Задаем вес кошки.
        originWeight = weight;                    // Присваиваем изначальный вес кошки = вес кошки.
        count++;                                  // При создании нового объекта класса Cat, count = count +1;
        alive = true;                             // При создании кошки "кошка жива" истинно.
        food = 0;                                 // Присвоение кол-ва еды
        name = "NoName";                          // Присвоение дефолтного имени
        colour = HairColour.BLACK;                // Присвоение дефолтного цвета
    }
    public Cat(double weight) {                   // Новый консутрктор кошки. Необходимо задать вес при создании нового объекта.
        this();                                   // Сохранение параметров предыдущего конструктора
        this.weight = weight;                     // Присвоение значения веса при создании объекта
        originWeight = weight;                    // Присвоение изначального веса
    }

    public Cat(Cat copyCat) {                     // Конструктор, копирующий объект.
        weight = copyCat.getWeight();
        name = copyCat.getName();
        colour = copyCat.getColour();
        alive = copyCat.getAlive();
        originWeight = copyCat.getOriginWeight();
        food = copyCat.getFood();
        count++;
    }

    //-----------------------Действия----------------------------------------------------
    public void meow() {                           // Метод "мяу"
        if (isAlive()) {
            weight = weight - 1;                   // Изменяем вес на "вес -1", если кошка жива.
            System.out.println("Meow.");
        }
        else {
            minusCat();                            // Если isAlive == false вызываем метод minusCat() и выводим сообщение.
            System.out.println("The cat is dead.");
        }
    }

    public void feed(Double amount) {              // Метод "кормить"
        if (isAlive()) {
            weight = weight + amount;              // Изменияем вес на "вес + корм". "корм" типа double, задаем при использовании метода.
            food += amount;                        // Присвоение перемнной "количество корма" значения "корм".
        }
        else {
            minusCat();                            // Если isAlive == false вызываем метод minusCat() и выводим сообщение.
            System.out.println("Can`t feed dead cats.");
        }
    }

    public void pee() {                            // Метод "пись-пись"
        if (isAlive()) {
            weight = weight - 100;                 // Изменяем вес кошки на "вес - 100", если кошка жива".
            System.out.println("Clean this up, human.");
        }
        else {                                     // Если кошка мертва - вызывается метод minusCat и выводится сообщение на консоль.
            minusCat();
            System.out.println("This cat is dead.");
        }
    }

    public void drink(Double amount) {                // Метод "пить".
        if (isAlive()) {
            weight = weight + amount;                 // Изменяем вес на "вес + вода" , если кошка жива.
        }
        else {                                        // Если кошка мертва - вызывается метод minusCat и выводится сообщение на консоль.
            minusCat();
            System.out.println("This cat is dead.");
        }
    }

    public void minusCat() {                         // Метод "минус кошка".
        if (alive) {                                 // Если у объекта alive = true - счётчик минусует одну кошку и меняет alive на false, чтобы
            count--;                                 // не минусовать эту кошку при следующем вызове метода.
            alive = false;
        }
    }

    //-----------------------Сеттеры----------------------------------------------------

    public void setColour(HairColour hairColour) {   // Метод "задать тсвет (ебучая буква тс) с параметрами - тип enum HairColour, имя hairColour
        this.colour = hairColour;                    // Присваиваем переменной тсвет параметр метода enum HairColour с именем hairColour
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void copyCat(Cat copyCat) {  // Метод, копирующий кошку
        weight = copyCat.getWeight();
        name = copyCat.getName();
        colour = copyCat.getColour();
        alive = copyCat.getAlive();
        originWeight = copyCat.getOriginWeight();
        food = copyCat.getFood();
    }

    //-----------------------Геттеры----------------------------------------------------
    public static int getCount() {                    // Метод "счёт кошек"
        return count;
    }

    public Double getFood() {                    // Метод "сколько корма"
        return food;                             // Возвращает кол-во корма, заданное в методе "кормить"
    }

    public Double getWeight() {                       // Метод "какой вес".
        return weight;                                // Возвращает вес кошки.
    }

    public HairColour getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public boolean getAlive() {
        return alive;
    }

    public double getOriginWeight() {
        return originWeight;
    }

    public boolean isAlive() {                        // Метод "жива ли кошка"
        return !(weight > MAX_WEIGHT) && !(weight < MIN_WEIGHT);
    }

    public String getStatus() {                       // Метод "статус".
        if(weight < MIN_WEIGHT) {                     // Если вес меньше минимального возвращает "мертва"
            minusCat();
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {                // Если вес больше максимального возвращает "взорвалась"
            //alive = false;                          // Задаёт переменной alive значние false.
            minusCat();                               // Вызывает метод "минус кошка".
            return "Exploded";
        }
        else if(weight > originWeight) {              // Если вес больше изначального возвращает "спит"
            return "Sleeping";
        }
        else {                                        // В остальных случаях "играет". (если вес изначальный или меньше, но больше минимального"
            return "Playing";
        }
    }
}