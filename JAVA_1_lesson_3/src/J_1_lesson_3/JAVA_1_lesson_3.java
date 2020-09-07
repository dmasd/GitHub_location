package J_1_lesson_3;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class JAVA_1_lesson_3 {

    public static void main (String args [ ] ) {

//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
// должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить
// игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


        for ( ; ; ){   // создаем бесконечный цикл
        Scanner play_scanner = new Scanner(System.in);  // вводим даныне от пользователя будет ли он играть
        System.out.println("Будете играть? ВВедите 1, если согласны или 0, если нет");
        int play = play_scanner.nextInt();


       if ( play ==1) {

            Random rand = new random();   // Задаем рандомное число
            int rand_number = rand.nextInt(10);
           // System.out.println(rand_number);


            for (int number_attempt = 3; number_attempt >= 0; number_attempt--) {

                Scanner sc = new Scanner(System.in);  // вводим даныне от пользователя
                System.out.println("Введите число от 0 до 9");
                int input_number = sc.nextInt();
                System.out.println(input_number);


                if (rand_number == input_number) {  // проверка совпадения чисел
                    System.out.println("Вы угадали число!");
                    break;
                } else {
                    if (rand_number > input_number) {
                        System.out.println("Загаданное число больше");
                        System.out.println("У вас " + number_attempt + " попыток");

                    } else {
                        System.out.println("Загаданное число меньше");
                        System.out.println("У вас " + number_attempt + " попыток");
                    }
                }



        }


        scanner close;

    }else {
           System.out.println("Нет, так нет");
           break;

       }}}}






