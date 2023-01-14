import java.util.Random;
import java.util.Scanner;

/**
 * Создайте двумерный массив. Выведите на консоль диагонали массива.
 */
public class ArrayDiagonals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Поиск диагоналей осуществляется в квадратных массивах");
        System.out.print("Введите размер массива: ");
        int row = scanner.nextInt();
        System.out.println("******* Создан массив **********");
        int [][] array = createArray(row);
        printArray(array);
        System.out.println("******** Диагонали массива *****");
        System.out.print("Главная диагональ: ");
        findMainDiagonal(array,row);
        System.out.println();
        System.out.print("Второстепенная диагональ: ");
        findSecondaryDiagonal(array,row);
        System.out.println();

    }

    private static void findMainDiagonal(int[][] curArray, int row){

        for (int i = 0; i < row; i++){
                System.out.print(curArray[i][i] + "\t");
        }
    }

    private static void findSecondaryDiagonal(int[][] curArray, int row){

        for(int i = 0; i < row; i++ ) {
                System.out.print(curArray[i][row - 1 - i] + "\t");
        }
    }

    private static int [][] createArray(int row){

        int [][] curArray = new int[row][row];

        for(int i = 0; i< row; i++){
            for(int j = 0; j < row; j++){
                curArray[i][j] = new Random().nextInt(20);
            }
        }
        return curArray;
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
