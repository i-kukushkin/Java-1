/**
* Homework. Java 1. Lesson 2.
*
*@author Ilya Kukushkin
*@version 
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class J1HwLesson3 {  

    public static void main(String[] args) {
        
        // Task 1.
        
        Scanner mainScanner = new Scanner(System.in);
        int retry;
        do {
            guessNumber();
            System.out.println("Повторить игру еще раз? 1 - да, 0 - нет:");
            retry = mainScanner.nextInt();
        } while (retry == 1);
        
        // Task 2.
        
        guessWord();
    }

    static void guessNumber() {
        System.out.println("Сыграем в игру. Я загадаю целое число от 0 до 9, а Вы попробуйте угадать. У Вас 3 попытки.");
        Random random = new Random();
        int theNumber = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 0 до 9:");
        for (int counter = 3; counter > 0; counter--) {
            int enteredNumber = scanner.nextInt();
            if (enteredNumber < 0 || enteredNumber > 9) {
                System.out.println("Ошибка! По условиям игры нужно ввести целое число от 0 до 9!");
                break;
            }
            else if (enteredNumber < theNumber) {
                if (counter > 1)
                    System.out.println("Введенное число меньше, чем загаданное. Попробуйте еще раз. Осталось попыток: " + (counter - 1));
                else
                    System.out.println("Сожалею, Вы проиграли...\tЗагаданное число: " + theNumber + ".");
                continue;
            } else if (enteredNumber > theNumber) {
                if (counter > 1)
                    System.out.println("Введенное число больше, чем загаданное. Попробуйте еще раз.Осталось попыток: " + (counter - 1));
                else
                    System.out.println("Сожалею, Вы проиграли...\tЗагаданное число: " + theNumber + ".");
                continue;
            } else if (enteredNumber == theNumber) {
                System.out.println("Поздравляю! Вы выиграли!");
                break;
            }
        }
    }
 
     static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                          "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                          "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Я загадаю слово, а Вам нужно его угадать.");
        Random random = new Random();
        String theWord = words[random.nextInt(25)];
        Scanner scanner = new Scanner(System.in);
        String enteredWord;
        int minLength;
        do {
            System.out.println("Введите слово:");
            enteredWord = scanner.nextLine();
            minLength = (theWord.length() < enteredWord.length()) ? theWord.length() : enteredWord.length();
            for (int i = 0; i < minLength; i++) {
                if (enteredWord.charAt(i) == theWord.charAt(i))
                    System.out.print(theWord.charAt(i));
                else
                    System.out.print("#");
            }
            if (enteredWord.equals(theWord)) {
                System.out.println("\nПоздравляю! Вы угадали!");
                break;
            } else {
                for (int i = 0; i < (15 - minLength); i++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
        } while (!enteredWord.equals(theWord));
    }
}

