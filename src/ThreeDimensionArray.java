import java.util.Random;

public class ThreeDimensionArray {

    public static void main(String[] args) {
        ThreeDimensionArray.createThreeDiArray(2,3,4);
    }

    private static void createThreeDiArray(int x, int y, int z){

        int [][][] threeDArray = new int[x][y][z];

        for(int i=0; i< threeDArray.length; i++){
            for(int j = 0; j < threeDArray[i].length; j++){
                for (int k = 0; k < threeDArray[i][j].length; k++){
                    int number = new Random().nextInt(20);
                    threeDArray[i][j][k] = number;
                }
            }
        }

        printArray(threeDArray);
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
}
