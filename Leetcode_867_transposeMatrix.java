import java.util.*;

class Leetcode_867_transposeMatrix {

    public static int[][] transposeMatrix(int[][] matrix) {

        int[][] arr = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                arr[j][i] = matrix[i][j];

            }
        }

        return arr;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and column");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] array = new int[r][c];

        System.out.println("Enter matrix elements");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                array[i][j] = sc.nextInt();

            }
        }

        int[][] result = transposeMatrix(array);

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result[0].length; j++) {

                System.out.print(result[i][j] + " ");

            }

            System.out.println();
        }
    }
}