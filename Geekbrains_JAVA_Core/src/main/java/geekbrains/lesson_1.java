package geekbrains;

public class lesson_1 {
    public static void main (String [] args)  {

        // Задание 2. Создание и инициализация переменных
        byte a = 127;
        int b = 2147483647;
        short c = 32767;
        long d = 9223372036854775806L;
        float e = 10.23f;
        double f = 652.65;
        char g = '^';
        boolean h = true;
        String i = "Hello World!";

        System.out.println ("\n    Задание 2.");
        System.out.println ("Тип данных byte, переменная а = " + a + ";");
        System.out.println ("Тип данных int, переменная b = " + b + ";");
        System.out.println ("Тип данных short, переменная c = " + c + ";");
        System.out.println ("Тип данных long, переменная d = " + d + ";");
        System.out.println ("Тип данных float, переменная e = " + e + ";");
        System.out.println ("Тип данных double, переменная f = " + f + ";");
        System.out.println ("Тип данных char, переменная g = " + g + ";");
        System.out.println ("Тип данных boolean, переменная h = " + h + ";");
        System.out.println ("Тип данных String, переменная i = " + i + ";");


        // Задание 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип double.

        System.out.println ("\n    Задание 3.");
        System.out.println ("Высчитываем выражение a * (b + (c / d)), получаем значение "  + calculatingTheExpression (1,2,3,4));

        // Задание 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        System.out.println ("\n    Задание 4.");
        System.out.println ("Принимаемые значения лежат в диапозоне от 10 до 20?  " + compareTwoNumbers (5,6));

        // Задание 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        System.out.println ("\n    Задание 5.");
        positiveNumber (1);

        // Задание 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

        System.out.println ("\n    Задание 6.");
        System.out.println ("Отрицательное число?  " + negativeNumber (5));

        // Задание 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        System.out.println ("\n    Задание 7.");
        helloString ("Дмитрий");

        //Задание 8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. */

        System.out.println ("\n    Задание 8.");
        leapYear (2000);

    }

    public static double  calculatingTheExpression (double a, double b, double  c, double d){
        return a * (b + (c / d));
    }

    public static boolean  compareTwoNumbers (int a, int b) {
        if (10 < (a + b)  & (a + b) < 20) {
            return true;
        } else return false;
    }

    public static void  positiveNumber (int a) {
        if (a >= 0) {
           System.out.println ("Принимаемое число, является положительным, либо равен нулю.");
        } else System.out.println ("Принимаемое число, является отрицательным.");
    }

    public static boolean  negativeNumber (int a) {
        if (a > 0) {
            return false;
        } else return true;
    }

    public static void helloString (String a) {
        System.out.println ("Привет, " + a + "!");
    }

    public static void leapYear (int a) {
        if (a % 4 == 0 && a % 100 !=0 || a % 400 == 0 ) {
            System.out.println("Год " + a + " является високосным.");
        } else System.out.println("Год " + a + " не является високосным.");
    }

}
