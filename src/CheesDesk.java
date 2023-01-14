/**
 * Шахматная доска
 *    Создать программу для раскраски шахматной доски с помощью цикла.
 *    Создать двумерный массив String'ов 8х8. С помощью циклов задать
 *    элементам циклам значения B(Black) или W(White). Результат работы
 *    программы:
 *    W B W B W B W B
 *    B W B W B W B W
 *    W B W B W B W B
 *    B W B W B W B W
 *    W B W B W B W B
 *    B W B W B W B W
 *    W B W B W B W B
 *    B W B W B W B W
 */
public class CheesDesk {

    public static void main(String[] args) {
        printArray(createArray());
    }
    private static String [][] createArray(){
        String [][] chessDesk = new String[8][8];

        for(int i = 0; i < chessDesk.length; i++){
            for(int j = 0; j < chessDesk[i].length; j++){
                if(i % 2 == 0) {
                    if (j - 1 < 0) {
                        chessDesk[i][j] = "W";
                    } else if (chessDesk[i][j - 1].equals("W")) {
                        chessDesk[i][j] = "B";
                    } else {
                        chessDesk[i][j] = "W";
                    }
                }else{
                    if (j - 1 < 0) {
                        chessDesk[i][j] = "B";
                    } else if (chessDesk[i][j - 1].equals("B")) {
                        chessDesk[i][j] = "W";
                    } else {
                        chessDesk[i][j] = "B";
                    }
                }
            }
        }

        return chessDesk;
    }
    private static void printArray(String [][] curArray){
        for (String[] strings : curArray) {
            for (String itm : strings) {
                  System.out.print(itm + "\t");
            }
            System.out.println();
        }

    }


}
