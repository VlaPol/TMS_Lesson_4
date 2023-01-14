import java.util.Random;
import java.util.Scanner;

/**
 * Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */
public class ArraySumAllElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int row = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int col = scanner.nextInt();
        System.out.println("******* Создан массив **********");
        int [][] array = createArray(row, col);
        printArray(array);
        System.out.println("******** Сумма всех элементов массива *****");
        System.out.println(findSumAllIntElements(array));

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

    private static int findSumAllIntElements(int [][] prepArray){

        int sum = 0;

        for(int[] rows: prepArray){
            for(int itm: rows){
                sum +=itm;
            }
        }
        return sum;
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
