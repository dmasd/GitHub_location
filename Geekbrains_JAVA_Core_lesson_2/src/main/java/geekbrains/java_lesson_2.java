package geekbrains;

import java.util.Arrays;

public class java_lesson_2 {

    public static void main(String[] args) {

/*   1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        System.out.println("\n    Задание 1.");

        int[] arrayReplacement = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayReplacement));

        for (int i = 0; i < arrayReplacement.length; i++) {
            if (arrayReplacement [i] == 1) {
                arrayReplacement [i]  = 0;
            } else {
                arrayReplacement [i] = 1;

            }
        }
        System.out.println(Arrays.toString(arrayReplacement));


/* 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */

        System.out.println("\n    Задание 2.");

        int[] arrayThree = new int[8];
        System.out.println(Arrays.toString(arrayThree));

        for (int a = 0, b = 0 ; a < arrayThree.length; a++, b++) {
            arrayThree [a] = b * 3;
        }
        System.out.println(Arrays.toString(arrayThree));


/* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2 */

        System.out.println("\n    Задание 3.");

        int[] array6on2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array6on2));

        for (int a = 0; a < array6on2.length; a++) {
           if ( array6on2 [a] < 6){
               array6on2 [a] *=2;
           }
        }
        System.out.println(Arrays.toString(array6on2));

/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */

        System.out.println("\n    Задание 4.");

        int arraySize = 6;
        int[][] arrayTable = new int[arraySize][arraySize];


        for (int a = 0; a < arrayTable.length; a++){
            for (int b = 0; b < arrayTable.length; b++) {
               if (a == b) {
                   arrayTable [a][b] = 1;
                   System.out.print(arrayTable[a][b] + " ");
               } else {
                   arrayTable [a][b] = 0;
                   System.out.print(arrayTable[a][b] + " ");
               }

            }
            System.out.println();
        }


/* 5.Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета) */

        System.out.println("\n    Задание 5.");

        int[] arrayMinMax = {13, 12,6, 10, 8,  9, 26};
        System.out.println(Arrays.toString(arrayMinMax));
        int arrayMin = arrayMinMax [0];
        int arrayMax = arrayMinMax [0];

        for ( int a = 0; a < arrayMinMax.length; a++){
            if (arrayMin > arrayMinMax [a]){
                arrayMin = arrayMinMax [a];
            }
            if (arrayMax < arrayMinMax [a]){
                arrayMax = arrayMinMax [a];
            }
        }
        System.out.println("Минимальное значение в массиве: " + arrayMin + ". Максимальное значение в массиве: " + arrayMax + ".");


/* 6.Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
 если в массиве есть место, в котором сумма левой и правой части массива равны.
 Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
  граница показана символами ||, эти символы в массив не входят. */

        System.out.println("\n    Задание 6.");



        }

    }




//       7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.


