package lesson_4;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static final char DOT_EMPTY = 'ф';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {

        //  Минимальное поле  от 3-х до 5, условие победы 3 фишки. 6-9, условие победы 4 фишки. 10+ условие победы 5 фишек
        //  Игровое поле, инициализация и вывод
        //  Ход игрока-человека (взаимодействие с консолью)
        //  Ход игрока-компьютера
        // Основной игровой цикл, условия победы и завершения игры
        // реализовать проверку подиагонали после хода

        startWelcome();
        start();

    }

    private static void startWelcome() {
        System.out.println(" Добро пожаловать в игру крестики - нолики!");
    }

    private static void start() {
        System.out.println(" Введите размер игрового поля! Не меньше 3-х.");
        int startField = scanner.nextInt();
        checkField(startField);
    }

    private static void checkField(int SIZE) {
        int chips; // фишки для победы
        if (SIZE < 3) {
            System.out.println("Вы ввели размер игрового поля меньше 3-х! Попробуйте заново");
            start();
        } else if (5 >= SIZE && SIZE >= 3) {
            chips = 3;
            System.out.println("Ваше игровое поле, равно " + SIZE + " на " + SIZE + ". Условие победы " + chips + " фишки вподряд.");
            gamefield(SIZE, chips);
        } else if (6 <= SIZE && SIZE <= 9) {
            chips = 4;
            System.out.println("Ваше игровое поле, равно " + SIZE + " на " + SIZE + ". Условие победы " + chips + " фишки вподряд.");
            gamefield(SIZE, chips);
        } else if (10 <= SIZE) {
            chips = 5;
            System.out.println("Ваше игровое поле, равно " + SIZE + " на " + SIZE + ". Условие победы " + chips + " фишки вподряд.");
            gamefield(SIZE, chips);
        }
    }

    public static void gamefield(int SIZE, int b) {

       int [][] arrayField = new int [SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arrayField[i][j] =  DOT_EMPTY;
            }
        }
        System.out.println (" 1 " + " ");


    }



}