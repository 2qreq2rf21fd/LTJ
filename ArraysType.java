import java.util.Arrays;

/**
 * @author i_petrenko I2nP6o
 * Одновимірні та багатовимірні масиви даних
 */

public class ArraysType {
    public static void main(String[] args) {
/*

    //Створення одновимірного масиву з та без заповнення даними
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int[] arrEmpty = new int [5];
        System.out.println(Arrays.toString(arrEmpty)); //без заповнення даними.
*/

/*
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr); //Посилання на область в памяті.
        System.out.println(Arrays.toString(arr)); // Вивід власних значень масиву
*/
/*
    //Зміна значення елементу та вивід в консоль
        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        arr[3] = 50;
        arr[4] = 100;

        System.out.println(arr[0]);
        System.out.println(arr[4]);

        */
    //Вивід довжини масиву (5) та останнього елементу  через довжину.

       /* int[] arr = new int[5];
        arr[4] = 15;

        System.out.println(arr.length);
        System.out.println(arr[arr.length -1]);

*/
    //Стоврення та виведення багатовимірного масиву

     /*   int[][] matrix = new int[4][3];
        matrix[1][1] = 11;
        System.out.println(Arrays.deepToString(matrix));

*/

       /* int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));*/

        int[][][] arr = new int[3][3][3];
        System.out.println(Arrays.deepToString(arr));
    }
}