//To search a key in sorted 2d matrix where the next element in either row or col is greater 
// eg -->  10 20 30 40 
        // 15 25 35 45
        // 27 29 37 48
        // 32 33 39 50





package twodArrays;

import java.util.Scanner;

public class StaircaseSearch {
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

        System.out.println("Enter key to search: ");
        int key = sc.nextInt();

        staircase(matrix , key);
        sc.close();
    }

    public static void staircase(int[][] matrix , int key){
        int currElemRow = 0;
        int currElemCol = matrix[0].length-1;
        int currElem = matrix[0][currElemCol];

        while(currElemRow >= 0 && currElemCol >= 0 && currElemRow < matrix.length && currElemCol < matrix[0].length ){
            if(key < currElem){
                currElemCol -= 1;
                currElem = matrix[currElemRow][currElemCol];
            }else if(key > currElem){
                currElemRow += 1;
                currElem = matrix[currElemRow][currElemCol];
            }else{
                System.out.println("Fount At : (" + currElemRow + "," + currElemCol + ")");
                break;
            }
        }
        System.out.println("Key Not Found");


    }

}
