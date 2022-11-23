// TO print the transpose of a matrix

package twodArrays;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of cols: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements row-wise: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printTranspose(matrix);

        
        sc.close();
    }

    public static void printTranspose(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[j][i] + " ") ;
            }
            System.out.println();
        }



    }
}
