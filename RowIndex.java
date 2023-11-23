package Dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.DoubleStream.generate;

public class RowIndex {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    int num = pascalsTriangle.get(i - 1).get(j - 1) + pascalsTriangle.get(i - 1).get(j);
                    currentRow.add(num);
                }
            }
            pascalsTriangle.add(currentRow);
        }
        return pascalsTriangle;
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalsTriangle = generate(rowIndex + 1);
        return pascalsTriangle.get(rowIndex);
    }

    public static void main(String[] args) {
        RowIndex solution = new RowIndex();
        int rowIndex = 3;
        List<Integer> row = solution.getRow(rowIndex);

        System.out.println("Row " + rowIndex + " of Pascal's triangle: " + row);
    }
}
