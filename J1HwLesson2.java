/**
* Homework. Java 1. Lesson 2.
*
*@author Ilya Kukushkin
*@version Aug 14 2018
*/

import java.util.Arrays;

class J1HwLesson2 {
    public static void main (String[] args) {
    System.out.println("\tTASK 1:");
    createIntArrayForTask1();
    System.out.println("\n\tTASK 2:");
    createIntArrayForTask2();
    System.out.println("\n\tTASK 3:");
    createIntArrayForTask3();
    System.out.println("\n\tTASK 4:");
    fillDiagArr();
    System.out.println("\n\tTASK 5:");
    findMaxMinInArr();
    System.out.println("\n\tTASK 6:");
    int[] arr = {10, 3, 7, 9, 11, 18};
    System.out.println("Return: " + compareLeftRight(arr));
    }
    
    // Задать целочисленный массив, состоящий из элементов 0 и 1: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0].
    //  С помощью цикла и условия заменить 0 на 1, 1 на 0;
    
    static void createIntArrayForTask1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Original array:\n" + Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1)
                    arr[i] = 0;
                else
                    arr[i] = 1;
            }
        System.out.println("1 changed to 0 and 0 changed to 1:\n" + Arrays.toString(arr));
    }
    
    // Задать пустой целочисленный массив размером 8. 
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    
    static void createIntArrayForTask2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; arr[i] = i * 3, i++) {}
        System.out.println(Arrays.toString(arr));
    }
    
    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    
    static void createIntArrayForTask3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Original array:\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
        System.out.println("Numbers less than 6 multiplied by 2:\n" + Arrays.toString(arr));
    }
    
    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    
    static void fillDiagArr() {
        int[][] arr = new int[5][5];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0, k = arr[i].length - (i+1); j < arr[i].length; j++){
                if (i == j)
                    arr[i][j] = 1;
                arr[i][k] = 1;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
    // Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    
    static void findMaxMinInArr() {
        int[] arr = {7, 3, 8, 10, 17};
        int maxVar = 0, minVar = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxVar)
                maxVar = arr[i];
            else if (arr[i] < minVar)
                minVar = arr[i];
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Max variable is: " + maxVar);
        System.out.println("Min variable is: " + minVar);
    }
    
    // Написать метод, в который передается не пустой одномерный целочисленный массив, 
    // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны;
    
    static boolean compareLeftRight(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
        int sumOfLeft = 0, sumOfRight = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfLeft += arr[i];
            sumOfRight = 0;
            for (int k = i + 1; k < arr.length; k++) {
                sumOfRight += arr[k];
            }
            if (sumOfLeft == sumOfRight) {
                System.out.println("Left part = " + sumOfLeft + " before position [" + (i + 1) + "] and Right part = " + sumOfRight + " starting from position [" + (i + 1) + "]");
                break;
            }
        }
        return (sumOfLeft == sumOfRight) ? true : false;
    }
}