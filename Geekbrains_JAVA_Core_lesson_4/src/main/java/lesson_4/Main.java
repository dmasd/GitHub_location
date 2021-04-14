package lesson_4;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //  Минимальное поле  от 3-х до 5, условие победы 3 фишки. 6-9, условие победы 4 фишки. 10+ условие победы 5 фишек
        //  Игровое поле, инициализация и вывод
        //  Ход игрока-человека (взаимодействие с консолью)
        //  Ход игрока-компьютера
        // Основной игровой цикл, условия победы и завершения игры
        // реализовать проверку подиагонали после хода

        startWelcome();


    }

    private static void startWelcome() {

        System.out.println(" Добро пожаловать в игру крестики - нолики!");
        start();
    }

    private static void start() {
        System.out.println(" Введите размер игрового поля! Не меньше 3-х.");
        int startField = scanner.nextInt();
        checkField(startField);
    }

    private static void checkField(int a) {
        int chips; // фишки для победы
        if (a < 3) {
            System.out.println("Вы ввели размер игрового поля меньше 3-х! Попробуйте заново");
            start();
        } else if (5 >= a && a >= 3) {
            chips = 3;
            System.out.println("Ваше игровое поле, равно " + a + " на " + a + ". Условие победы " + chips + " фишки вподряд.");
            gamefield(a, chips);
        } else if (6 <= a && a <= 9) {
            chips = 4;
            System.out.println("Ваше игровое поле, равно " + a + " на " + a + ". Условие победы " + chips + " фишки вподряд.");
            gamefield(a, chips);
        } else if (10 <= a) {
            chips = 5;
            System.out.println("Ваше игровое поле, равно " + a + " на " + a + ". Условие победы " + chips + " фишки вподряд.");
            gamefield(a, chips);
        }
    }

    public static void gamefield(int a, int b) {
        System.out.println("ТУт задействован метод ");


    }

}