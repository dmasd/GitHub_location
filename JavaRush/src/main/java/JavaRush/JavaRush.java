package JavaRush;


import java.util.Scanner;

public class JavaRush {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int max= Integer.MIN_VALUE;


            for (;;){
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (b % 2 == 0 && a % 2 == 0){

                if (max > b){
                    System.out.println(max);
                } else if (max < b){
                       max = b;
                   System.out.println(max);
                }

            }}






        }

}
