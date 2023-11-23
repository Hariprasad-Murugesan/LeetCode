package Dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        for (int i = 0; i <numRows; i++){
         List<Integer> currentRow = new ArrayList<>();
        for (int j =0 ; j<= i; j++){
            if (j == 0 || j== i ){
                currentRow.add(1);
            }else {
                int num = pascalsTriangle.get(i-1).get(j-1)+ pascalsTriangle.get(i-1).get(j);
                currentRow.add(num);
            }
        }
        pascalsTriangle.add(currentRow);
        }
        return pascalsTriangle;
    }


    public static void main(String[] args) {
        PascalsTriangle solution = new PascalsTriangle();
        int numRows = 5;
        List<List<Integer>> pascalTriangle = solution.generate(numRows);

        // Print Pascal's triangle
        for (List<Integer> row : pascalTriangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}