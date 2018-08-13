/**
* Homework. Java 1. Lesson 1.
*
*@author Ilya Kukushkin
*@version Aug 10 2018
*/

class Homework_Lesson_1 {
    public static void main (String[] args) {
    System.out.println("Must be 8: " + calculatingResult(2,2,4,2)); // Проверка, 2 * (2 + (4 / 2)) = 8
    System.out.println("Check - true: " + takeTwoNumbers(10, 5)); // Проверка, должно быть true
    System.out.println("Check - false: " + takeTwoNumbers(10, 15)); // Проверка, должно быть false
    checkPositiveOrNegative(2); // Проверка, положительное
    checkPositiveOrNegative(-3); // Проверка, отрицательное
    System.out.println("Must be true: " + returnNumber(-3)); // Проверка, должно быть true
    sayHello("John"); // Должно быть "Hello, John!"
    checkYear(400); // Високосный
    checkYear(100); // Не високосный
    checkYear(1600); // Високосный
    checkYear(1997); // Не високосный
    }

    static void createVar() {
    // создаем переменные всех пройденных типов
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g;
        char h;
    }

    static int calculatingResult(int a, int b, int c, int d) {
        // Метод вычисляет результат и возвращает результат выражения, указанного в return
        // На входе задаются параметры, целочисленные
        return a * (b + (c / d));
        }

    static boolean takeTwoNumbers(int a, int b) {
        // Метод проверяет, лежит ли сумма в диапазоне от 10 до 20 и возвращает true или false
        if ((a + b) >= 10 && (a + b) <= 20)
            return true;
        else
            return false;
    }

    static void checkPositiveOrNegative(int a) {
        // Метод проверяет число на положительное/отрицательное
        if (a >= 0)
            System.out.println("Positive number!");
        else
            System.out.println("Negative number!");
    }

    static boolean returnNumber(int a) {
        // Возвращает true, если число отрицательное
        if (a < 0)
            return true;
        return false;
    }

    static void sayHello(String s) {
        // Метод должен вывести сообщение "Привет, указанное_имя!"
        System.out.println("Hello, " + s + "!");
    }

    static void checkYear(int a) {
        // Проверка года на "високосность"
        if ((a % 400) == 0)
            System.out.println("Leap-year");
        else if ((a % 100) == 0)
            System.out.println("Not leap-year");
        else if ((a % 4) == 0)
           System.out.println("Leap-year");
        else
            System.out.println("Not leap-year");
    }
}