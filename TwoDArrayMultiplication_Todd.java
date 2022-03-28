
import java.util.Scanner;
public class TwoDArrayMultiplication_Todd {
    public static void main(String[] args) {
        MyMethod.myHeader();
        Scanner input = new Scanner(System.in);
        int row1 = 0, column1 = 0;
        System.out.println("Multiplying 2D arrays: ");
        System.out.print("Enter array 1 info: \n");
        System.out.print("Enter row size: ");
        row1 = input.nextInt();
        System.out.print("Enter column size: ");
        column1 = input.nextInt();
        int[][] testArray1 = new int[row1][column1];
        populate2DArrays(testArray1);
        display2DArrays(testArray1);
        int row2 = 0, column2 = 0;
        System.out.print("\nEnter array 2 info: ");
        System.out.print("\nEnter row size: ");
        row2 = input.nextInt();
        System.out.print("Enter column size: ");
        column2 = input.nextInt();
        int[][] testArray2 = new int[row2][column2];
        populate2DArrays(testArray2);
        display2DArrays(testArray2);
        System.out.print("array 1 x array 2 is: \n");
        multiplyArrays(testArray1,testArray2);
    }

    public static void populate2DArrays(int[][] ma) {
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = (int) ((Math.random()) * 4 + 2);

            }
        }
    }

    public static void display2DArrays(int[][] ma) {
        int i, j;
        for (i = 0; i < ma.length; i++) {
            for (j = 0; j < ma[i].length; j++) {
                System.out.printf("%3d", ma[i][j]);
            }
            System.out.println();

        }

    }

    public static int[][] multiplyArrays(int[][] a, int[][] b) {
        int[][] ab = new int[a.length][b[0].length];
        for (int i = 0; i < ab.length; i++) {
            for (int j = 0; j < ab[i].length; j++) {
                ab[i][j] = a[i][j]*b[j][i];

            }

        }
        return ab;
    }
}