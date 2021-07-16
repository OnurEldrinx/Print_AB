import java.util.Arrays;

public class Main {
    public static void main(String[] args){



        /*

         0 1 2 3 4 5 6 7 8
         * * * * * * * * * 0
         *               * 1
         *               * 2
         *               * 3
         *               * 4
         *               * 5
         * * * * * * * * * 6
         *               * 7
         *               * 8
         *               * 9
         *               * 10
         *               * 11
         *               * 12


         0 1 2 3 4 8 9 7 8
         * * * * * * *     0
         *             *   1
         *               * 2
         *               * 3
         *               * 4
         *             *   5
         * * * * * * *     6
         *             *   7
         *               * 8
         *               * 9
         *               * 10
         *             *   11
         * * * * * * *     12

         */

        char[][] a1 = new char[13][9];

        for (int i=0;i<=12;i++){

            if (i == 6 || i == 0){

                Arrays.fill(a1[i],'*');

            }else{

                Arrays.fill(a1[i],1,8,' ');


            }


        }


        for (int i=0;i<a1.length;i++){

            a1[i][0] = '*';

        }
        for (int i=0;i<a1.length;i++){

            a1[i][8] = '*';

        }


        System.out.println("CHARACTER 'A'");
        System.out.println("-------------");
        System.out.println();

        for (int i=0;i< a1.length;i++){

            for (int j=0;j<a1[i].length;j++){

                System.out.print(a1[i][j] + " ");

            }

            System.out.println();

        }



        /*

         0 1 2 3 4 5 6 7 8
         * * * * * * *     0
         *             *   1
         *               * 2
         *               * 3
         *               * 4
         *             *   5
         * * * * * * *     6
         *             *   7
         *               * 8
         *               * 9
         *               * 10
         *             *   11
         * * * * * * *     12

         */

        char[][] b1 = new char[13][9];

        Arrays.fill(b1[0],0,7,'*');
        Arrays.fill(b1[6],0,7,'*');
        Arrays.fill(b1[12],0,7,'*');

        b1[1][7] = '*';
        b1[5][7] = '*';
        b1[7][7] = '*';
        b1[11][7] = '*';

        b1[2][8] = '*';
        b1[3][8] = '*';
        b1[4][8] = '*';
        b1[8][8] = '*';
        b1[9][8] = '*';
        b1[10][8] = '*';

        for (int i=0;i< b1.length;i++){

            b1[i][0] = '*';

        }

        Arrays.fill(b1[0],7,9,' ');
        Arrays.fill(b1[6],7,9,' ');
        Arrays.fill(b1[12],7,9,' ');

        Arrays.fill(b1[1],1,7,' ');
        Arrays.fill(b1[5],1,7,' ');
        Arrays.fill(b1[7],1,7,' ');
        Arrays.fill(b1[11],1,7,' ');

        Arrays.fill(b1[2],1,8,' ');
        Arrays.fill(b1[3],1,8,' ');
        Arrays.fill(b1[4],1,8,' ');
        Arrays.fill(b1[8],1,8,' ');
        Arrays.fill(b1[9],1,8,' ');
        Arrays.fill(b1[10],1,8,' ');


        b1[1][8] = ' ';
        b1[5][8] = ' ';
        b1[7][8] = ' ';
        b1[11][8] = ' ';


        System.out.println();
        System.out.println("CHARACTER 'B'");
        System.out.println("-------------");
        System.out.println();

        for (int i=0;i< b1.length;i++){

            for (int j=0;j<b1[i].length;j++){

                System.out.print(b1[i][j] + " ");

            }

            System.out.println();
        }













    }
}
