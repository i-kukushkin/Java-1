/**
 * Homework. Java 1. Lesson 4.
 *
 * @author Ilya Kukushkin
 * @version 23 Aug 2018
 */
import java.util.Random;
import java.util.Scanner;

class J1HwLesson4 {

    final int SIZE = 4;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new J1HwLesson4();
    }

    J1HwLesson4() {
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1.." + SIZE + "):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    boolean checkWin(char dot) {
        int i, j;
        boolean count, count1;
        // check horizontals
        for (i = 0; i < SIZE; i++) {
            for (j = 0, count = true; j < SIZE; j++) {
                count &= (map[i][j] == dot);
            }
            if (count)
                return true;
        }
        // check verticals
        for (i = 0; i < SIZE; i++) {
            for (j = 0, count = true; j < SIZE; j++) {
                count &= (map[j][i] == dot);
            }
            if (count)
                return true;
        }
        // check diagonals
        for (i = 0, count = true, count1 = true; i < SIZE; i++) {
            count &= (map[i][i] == dot);
            count1 &= (map[SIZE - i - 1][i] == dot);
        }
        if (count || count1)
            return true;

        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY;
    }
}