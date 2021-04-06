package geekbrains;

import java.util.Scanner;

public class lesson_3 {

    public static void main(String[] args) {

        for (; ; ) {

            int z = randomNumber(); // метод задает число
            int a = 3; // колличество попыток
            int b = a - 1; // Оставшееся колличество попыток

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner sc1 = new Scanner(System.in);
            int g = sc1.nextInt();

            if (g == 1) {

                System.out.println("Угадайте число от 0 до 9. ");
                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < a; i++, b--) {

                    int c = sc.nextInt();

                    System.out.println(" Рандомное загаданое: " + z);
                    if (c == z) {
                        System.out.println("Вы угадали число.");
                        break;
                    } else if (c > z) {
                        System.out.println("Загаданное число меньше. Попробуйте еще. У вас колличесвто попыток " + b);
                    } else if (c < z) {
                        System.out.println("Загаданное число больше. Попробуйте еще. У вас колличесвто попыток " + b);
                    }

                }

                sc.close();
            } else  break;

            sc1.close();
        }

    }

    public static int randomNumber() {
        int f = 10; // максимальное значение
        int randomNumber1 = (int) (Math.random() * f);
        return randomNumber1;

    }

/* 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать
 это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное,
  или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
  (1 – повторить, 0 – нет).

 2. Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
 "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
 "pear", "pepper", "pineapple", "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
 словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
  которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.*/


}
