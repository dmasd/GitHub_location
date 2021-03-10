package game;

    public class JAVA_1_lesson_4 {


           static char [] [] map; //организовали двумерный массив
           static final int SIZE = 3;
           static final char DOT_X = 'X';
           static final char DOT_O = 'O';
           static final char DOT_EMPTY = '.';

           static void initMap () {
               map = new char [SIZE] [SIZE];
               for (int i=0; i < map.length; i++){
                   for (int j=0; j<map[i].length; j++){
                       map [i] [j] = DOT_EMPTY;
                   }
               }
        }

        static void humanTurn {


        }


        static void printMap (){
               for (int i = 0; i<=SIZE; i++){
                   System.out.print (i + " ");
               }
               System.out.println ();
               for (int i=0; i<SIZE; i++){
                   System.out.print((i+1)+ " ");
                   for (int j=0; j<SIZE; j++){
                       System.out.print( map [i][j]+ " ");
                   }
                   System.out.println ();
               }
        }



        public  static void main (String[] args) {


        initMap ();
        printMap ();


    }

        }

