package ru.geekbrains.lesson1;

public class MainApp {

    //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main (String [] args) {

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    System.out.println ("Создание и инициализация 8 примитивных типов данных:");
    byte type_byte = -128;
    System.out.println ("1) Тип данных byte: " + type_byte);
    short type_short = -32768;
    System.out.println ("2) Тип данных short: " + type_short);
    int type_int = -2147483648;
    System.out.println ("3) Тип данных int: " + type_int);
    long type_long = -9223372036854775808L;
    System.out.println ("4) Тип данных long: " + type_long);
    float type_float = 12.23f;
    System.out.println ("5) Тип данных float: " + type_float);
    double type_double = -123.123;
    System.out.println ("6) Тип данных double: " + type_double);
    char type_char = '*';
    System.out.println ("7) Тип данных char: " + type_char);
    boolean type_bolean = true;
    if (type_bolean == true){
        System.out.println ("8) Тип данных boolean: true");
    }else {
        System.out.println ("8) Тип данных boolean: false");
    }

 // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

        System.out.println ("Задание 3, решаем выражение a * (b + (c / d)), итого: " + expression (1,5,6,8)); // вызов метода expression и передача методу 4 аргумента типа int

 //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

        System.out.println ("Задание 4, принимаем на вход два числа, сравниванием их сумму, сумма должна быть в диапозоне от 10 до 20 включительно " + expression1 (14,5));

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

        System.out.println ("Задание 5, полученное число является: "  );
        number5 (5);

 //  6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

        System.out.println ("Задание 6. Число отрицательное? " + number6 (8));

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

        string7("Задание 7. Дмитрий");

//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        System.out.println ("Задание 8. Год, является " ); yearsTask8 (800);


    }

    public static int expression (int a, int b, int c, int d) { // создаем метод expression, задание 3
        // выражение, которое нужно посчитать и вернуть
        return a * (b + (c / d));
    }

    public static boolean expression1 (int a, int b){ // создаем метод expression1, задание 4
        int c = a + b;
        boolean d;
        if (c >= 10 & c <=20){
            d = true;
        } else  d = false;
        return d;
    }

    public static void number5 (int a) {   // создаем метод number5, задание 5

        if (a >= 0) {
            System.out.println ("Положительное число");
        } else {
            System.out.println ("Отрицательное число");
        }
    }

    public static boolean number6 (int a) {

        if (a < 0) {
              return true;
        }return false;

    }

    public static void string7 (String textmyname){
        System.out.println ("Привет, " + textmyname);
    }

    public static void yearsTask8 (int a) {

        if (a % 4 == 0  & a % 100 != 0 | a % 400 == 0 ){
            System.out.println (" високостный." );

        }else System.out.println (" НЕ високостный.");
    }
/*


8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
}
