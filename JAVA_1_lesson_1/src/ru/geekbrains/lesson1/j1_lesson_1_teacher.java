package ru.geekbrains.lesson1;

public class j1_lesson_1_teacher {

        public static void main (String []arss) {

            // венгерская нотация - устаревшая, использовать не стоит.
            float fA = 5.9f;
            float fB = 5.0f;
            float fC = 3.14f;
            float fD = 4f;

            float expressionResult = getExpression(fA, fB, fC, fD);
            float expressionResult = calculateExpression(fA, fB, fC, fD);
            System.out.println("Результат вычислений: " + expressionResult);

            System.out.println(isBetween10And20(9, 10));

            /*
             *  Написать метод вычисляющий выражение a * (b + (c / d)) и
             *  возвращающий результат,
             *  где a, b, c, d – входные параметры этого метода;
             */
            public static float getExpression (float a, float b, float c, float d);
            public static float calculateExpression ( float a, float b, float c, float d);
            {
                return a * (b + (c / d));
            }
            /*
             * Написать метод, принимающий на вход два числа,
             * и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
             * если да – вернуть true, в противном случае – false;
             */
            public static boolean isBetween10And20(int a, int b)
            {
                int sum = a + b; // вычисляем единожды выражение
                boolean res = sum > 10 && sum <= 20; // Можно использовать как отдельную переменную, так и сразу это выражение
                // пихать в return.
                return res;
            }
            /*
             * Написать метод, которому в качестве параметра передается целое число,
             * метод должен напечатать в консоль положительное ли число передали, или отрицательное;
             * Замечание: ноль считаем положительным числом.
             */
            public static void printNegativeOrPositive(int number)
            {
                // Этот вариант уместен.
                if (number >= 0)
                {
                    System.out.println(number + " положительное число");
                }
                else
                {
                    System.out.println(number + " отрицательное число");
                }
            }
            /*
             * Написать метод, которому в качестве параметра передается целое число,
             * метод должен вернуть true, если число отрицательное;
             */
            public static boolean isNegative(int number)
            {
                return number < 0;
            }
            /*
             * Написать метод, которому в качестве параметра передается строка, обозначающая имя,
             * метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
             */
            public static void printName(String name) // у кого-то видел getName - такое название метода подошло бы, если бы этот метод возвращал что - то.
            {
                System.out.println("Привет, " + name + "!");
            }
            /*
             * Написать метод, который определяет является ли год високосным, и
             * выводит сообщение в консоль.
             * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
             */
            public static void printIfYearIsLeapOrNot(int year)
            {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                {
                    System.out.println(year + " год является високосным.");
                }
                else
                {
                    System.out.println(year + " год является невисокосным.");
                }
            }
        }





