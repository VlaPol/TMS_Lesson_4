import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в
 * строках двумерного массива по возрастанию.
 */
public class SortedRows {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int row = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int col = scanner.nextInt();
        System.out.println("******* Создан массив **********");
        int [][] array = createArray(row, col);
        printArray(array);
        System.out.println("******** Отсортированные строки *****");
        sortedRows(array);

    }
    private static int [][] createArray(int row, int col){

        int [][] curArray = new int[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0; j < col; j++){
                curArray[i][j] = new Random().nextInt(20);
            }
        }
        return curArray;
    }
    private static void sortedRows(int [][] prepArray){

        for (int[] ints : prepArray) {
            Arrays.sort(ints);
            System.out.println(Arrays.toString(ints));
        }
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
