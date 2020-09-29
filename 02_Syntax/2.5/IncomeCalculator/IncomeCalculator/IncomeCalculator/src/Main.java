import java.util.Scanner;

public class Main {                                       // Класс Main
    private static int minIncome = 200000;                // Переменная "Минимальная прибыль"
    private static int maxIncome = 900000;                // Переменная "Максимальная прибыль"

    private static int officeRentCharge = 140000;         // Переменная "Аренда офиса"
    private static int telephonyCharge = 12000;           // Переменная "Оплата телефонной связи"
    private static int internetAccessCharge = 7200;       // Переменная "Оплата интернета"

    private static int assistantSalary = 45000;           // Переменная "Зарплата ассистента"
    private static int financeManagerSalary = 90000;      // Переменная "Зарплата финансового менеджера"

    private static double mainTaxPercent = 0.24;          // Переменная "Налог (ставка)"
    private static double managerPercent = 0.15;          // Переменная "Процент менеджера"

    private static double minInvestmentsAmount = 100000;  // Переменная "Минимальные инвистиции"
    // pureIncomeAfterTax = pureIncome - taxAmount = 100000
    // pureIncome = income - managerSalary - 294200
    // managerSalary = income * managerPercent
    // taxAmount = mainTaxPercent * pureIncome;
    // 100000 = pureIncome - 0.24*pureIncome = 0.76 * pureIncome = 0.76 * (0.85 * income - 294200) = 0.646 * income - 223592;
    // income = 500917
    public static void main(String[] args) {              // Метод main
        while (true) {                                    // Бесконечный цикл while
            System.out.println("Введите сумму доходов компании за месяц " +   // Вывод на консоль запроса доходов
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt();                  // Ввод с консоли перемнной income (доход)

            if (!checkIncomeRange(income)) {                                  // проверка на соответствие пороговым начениям дохода.
                continue;
            }

            double managerSalary = income * managerPercent;                   // Зарплата менеджера (Доход * Процент менеджера
            double pureIncome = income - managerSalary -                      // Чистый доход (Доход - зарплата менеджера - фиксированные затраты)
                calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome;                   // Размер налогов (Ставка * чистый доход)
            double pureIncomeAfterTax = pureIncome - taxAmount;               // Чистый доход после налогов (Чистый доход - размер налогов)

            boolean canMakeInvestments = pureIncomeAfterTax >=                // Переменная булиан "Можно ли инвестировать" = Чистый доход после налогов >= минимальные инвситиции
                minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary);       // Вывод в консоль зарплаты менеджера
            System.out.println("Общая сумма налогов: " +                      // Вывод в консоль суммы налогов
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +             // Вывод в консоль возможности инвестировать посредством тетрарной операции
                (canMakeInvestments ? "да" : "нет"));
            if (pureIncome < 0) {                                             // Условие, при котором чистый доход меньше 0
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");  // Вывод в консоль сообщения при выполнении условия.
            }
        }
    }

    private static boolean checkIncomeRange(int income) {       // Задача переменной булиан "Проверка дохода"
        if (income < minIncome) {                               // Условие, при котором доход ниже минимального
            System.out.println("Доход меньше нижней границы");  // Вывод сообщения, если условие выполнено
            return false;                                       // Возвращение перемнной checkIncomeRange значение false
        }
        if (income > maxIncome) {                               // Условие, при котором доход выше максимального
            System.out.println("Доход выше верхней границы");   // Вывод сообщения, если условие выполнено
            return false;                                       // Возвращение перемнной checkIncomeRange значение false
        }
        return true;                                            // Возвращение перемнной checkIncomeRange значение true, если оба условия не выполняются
    }

    private static int calculateFixedCharges() {     // Задача переменной "Расчёт фиксированных затрат"
        return officeRentCharge +                    // Возвращает значение суммы "Аренда офиса" +
            telephonyCharge +                        // "Оплата телефона" +
            internetAccessCharge +                   // "Оплата интернета" +
            assistantSalary +                        // "Зарплата ассистента" +
            financeManagerSalary;                    // "Зарплата финансового менеджера"
    }
}
