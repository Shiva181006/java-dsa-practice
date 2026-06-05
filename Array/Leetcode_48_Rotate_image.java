import java.util.*;

class Leetcode_48_Rotate_image {


    public void rotate(int[][] matrix) {

        int n = matrix.length;


        // Step 1: Transpose Matrix
        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }



        // Step 2: Reverse each row
        for(int i = 0; i < n; i++){

            int left = 0;
            int right = n - 1;


            while(left < right){

                int temp = matrix[i][left];

                matrix[i][left] = matrix[i][right];

                matrix[i][right] = temp;


                left++;
                right--;
            }
        }
    }



    public static void main(String[] args) {


        int[][] matrix = {

                {1,2,3},
                {4,5,6},
                {7,8,9}

        };


        Leetcode_48_Rotate_image obj = new Leetcode_48_Rotate_image();



        System.out.println("Before Rotation:");

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix.length;j++){

                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }



        obj.rotate(matrix);



        System.out.println("\nAfter Rotation:");

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix.length;j++){

                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }

    }
}