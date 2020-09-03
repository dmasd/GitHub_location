package JAVA_1_lesson_2;

public class JAVA_1_lesson_2 {

     public static void main (String args[]){

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

         System.out.println(" Задание № 1 \n");

         int nums [] =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

         for (int i =0; i <= 9; i++)
         {
             System.out.println("  Значение из массива под индексом [" + i + "] = " + nums[i]);
             switch (nums[i]){
                 case 0:
                     nums [i] = 1;
                     System.out.println ("  Изменили значение на " + nums [i] +"\n");
                     break;
                 case 1:
                     nums [i] = 0;
                     System.out.println ("  Изменили значение на " + nums [i] +"\n");
                     break;
             }
         }


        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

         System.out.println(" Задание № 2 \n");

         int empty_array [] = new int [8];

         for (int b = 0; b <8 ; b++)
         {
             empty_array [b] =+ (3 * b);
             System.out.println("  Значение из массива под индексом [" + b + "] = " + empty_array [b]);
         }


        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

         System.out.println("\n Задание № 3 \n");

         int array_less_6_multiply_2 []= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

         for (int t = 0; t < array_less_6_multiply_2.length; t++)
         {
             System.out.println("  Значение из массива под индексом [" + t + "] = " + array_less_6_multiply_2 [t]);
             for ( ; array_less_6_multiply_2 [t] < 6; )
             {
                 array_less_6_multiply_2 [t] *=2;
                 System.out.println("  Умножили на 2 = " + array_less_6_multiply_2 [t]);
                 break;
             }
         }


        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

         System.out.println("\n Задание № 4 \n");

         int  diagonal_array [][] = new int [4][4];

         int diagonal_y;
         int diagonal_x;
         int diagonal = 1;

             for (diagonal_y = 0; diagonal_y < 4; diagonal_y++) {  //идём по строкам

             for (diagonal_x = 0;  diagonal_x < 4; diagonal_x++) {//идём по столбцам
                 if(diagonal_y == diagonal_x){
                 diagonal_array [diagonal_y][diagonal_x] = 1;
             }else {
                     diagonal_array [diagonal_y][diagonal_x] = 0;
                 }
                 System.out.print(" " +  diagonal_array [diagonal_y][diagonal_x] + " "); //вывод элемента
             }

             System.out.println();//перенос строки ради визуального сохранения табличной формы
         }


        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

         System.out.println("\n Задание № 5 \n");

         int min_max_array [] = {2,3,4,5,6,7,8,9};

        for (int u = 0, u_max = 0, u_min=100; ; ){

         for (; u < min_max_array.length ; u++){

             for ( ; u_max <  min_max_array [u]; ){

                u_max = min_max_array [u];

             }
             for ( ; u_min >  min_max_array [u]; ){
                 u_min = min_max_array [u];

             }
             }
         System.out.println("  Значение МАКСИМАЛЬНОЕ из массива  = " + u_max);
         System.out.println("  Значение МИНИМАЛЬНОЕ из массива  = " + u_min);
         break;
         }





        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

}}
