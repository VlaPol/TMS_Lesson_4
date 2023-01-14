import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Умножение двух матриц
 *    Создайте два массива целых чисел.
 *    Напишите программу для умножения двух матриц.
 *    Работает при любых размерностях при условии что кол-во столбцов первой равно числу строк второй и наоборот
 */
public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк первой матрицы: ");
        int row1 = scanner.nextInt();
        System.out.print("Введите количество столбцов первой матрицы: ");
        int col1 = scanner.nextInt();
        System.out.print("Введите количество строк второй матрицы: ");
        int row2 = scanner.nextInt();
        System.out.print("Введите количество столбцов второй матрицы: ");
        int col2 = scanner.nextInt();
        System.out.println("******* Созданы матрицы **********");
        int [][] array1 = createArray(row1, col1);
        int [][] array2 = createArray(row2, col2);
        printArray(array1);
        System.out.println("       **************              ");
        printArray(array2);
        System.out.println("***********************************");
        System.out.println("******** Результат перемножения матриц *****");
        matrixMultiplications(array1, array2, row1, col2);

    }

    private static int [][] createArray(int row, int col){

        int [][] curArray = new int[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                curArray[i][j] = new Random().nextInt(5);
            }
        }
        return curArray;
    }

    private static void matrixMultiplications(int [][] prepArray1, int [][] prepArray2, int row1, int col2){

        int [] tmpArray;
        int [] multiTemp;
        int[][] multRezult = new int[row1][row1];

        for(int i = 0; i < prepArray1.length; i++){
            tmpArray = new int[prepArray1[i].length];
            System.arraycopy(prepArray1[i], 0, tmpArray, 0, prepArray1[i].length);
            multiTemp = supportMultRowOnArray(tmpArray, prepArray2, col2, row1);
            System.arraycopy(multiTemp, 0, multRezult[i], 0, prepArray1.length);
        }
        System.out.println(Arrays.deepToString(multRezult));
    }

    private static int[] supportMultRowOnArray(int [] tmpArray, int [][] prepArray2, int col2, int row1){

        int[] returnArray = new int[row1];

        for(int i = 0; i < col2; i++){
            int mult;
            int sum = 0;

            for(int j = 0; j < tmpArray.length; j++){
                mult = prepArray2[j][i] * tmpArray[j];
                sum += mult;
            }
            returnArray[i] = sum;

        }

        return returnArray;
    }
    private static void printArray(int [][] curArray){
        for (int [] ints : curArray) {
            for (int itm : ints) {
                System.out.print(itm + "\t");
            }
            System.out.println();
        }

    }
}
