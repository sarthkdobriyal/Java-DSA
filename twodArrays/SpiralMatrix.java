//to print a 2d matrix in spiral starting from the first row

package twodArrays;

import java.util.Scanner;

public class SpiralMatrix {
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

        spiralPrint(matrix);
        sc.close();
    }

    public static void spiralPrint(int[][] matrix){
        int startrow = 0 ;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int i=startcol ;i <=endcol;i++){
                System.out.print(matrix[startrow][i] + " ");
            }
            startrow++;
            for(int i=startrow;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+ " ");
            }
            endcol--;
            for(int i=endcol;i>=startcol;i--){
                System.out.print(matrix[endrow][i]+ " ");
            }
            endrow--;
            for(int i=endrow;i>=startrow;i--){
                System.out.print(matrix[i][startcol]+ " ");
            }
            startcol++;


        }



    }




}
