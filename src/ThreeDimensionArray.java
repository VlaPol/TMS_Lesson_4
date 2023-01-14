import java.util.Random;
import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */
public class ThreeDimensionArray {

    public static void main(String[] args) {

        int xDim;
        int yDim;
        int zDim;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива. Для наглядности" +
                " значения должны быть больше 1 ");
      do {
          System.out.print("Первое значение: ");
          xDim = scanner.nextInt();
          System.out.print("Второе значение: ");
          yDim = scanner.nextInt();
          System.out.print("Значение значение: ");
          zDim = scanner.nextInt();
          if(xDim <=1 || yDim <= 1 || zDim <= 1) System.out.println("Введены некорректные исходные данные. " +
                  "Для наглядности ВСЕ значения должны быть больше 1 !");
      }while( xDim <= 1 || yDim <= 1 || zDim <= 1);

        System.out.println("*******   Исходные массивы  *******");
        int [][][] preparedArray  = createThreeDiArray(xDim, yDim, zDim);
        printArray(preparedArray);
        System.out.println("***********************************");

        System.out.print("Введите число, на которое необходимо увеличить каждый элемент массива: ");
        int addNUmber = scanner.nextInt();

        System.out.println("\n*****   Измененный массивы  ******");
        printArray(task(preparedArray,addNUmber));
        System.out.println("***********************************");

    }

    private static int [][][] createThreeDiArray(int x, int y, int z){

        int [][][] threeDArray = new int[x][y][z];

        for(int i=0; i< threeDArray.length; i++){
            for(int j = 0; j < threeDArray[i].length; j++){
                for (int k = 0; k < threeDArray[i][j].length; k++){
                    threeDArray[i][j][k] = new Random().nextInt(20);
                }
            }
        }

        return threeDArray;
    }

    private static void printArray(int [][][] array){
        for (int[][] ints : array) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static int [][][] task(int [][][] curArray, int number){
        for(int i=0; i< curArray.length; i++){
            for(int j = 0; j < curArray[i].length; j++){
                for (int k = 0; k < curArray[i][j].length; k++){
                    curArray[i][j][k] += number;
                }
            }
        }
        return curArray;
    }
}
