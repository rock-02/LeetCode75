package Arrays;
import java.util.*;

public class equalPairsArray {
    public int printRowsAndColumns(int[][] grid) {
        int c = 0;
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                temp.add(grid[i][j]);
            }
            al.add(temp);
        }

        ArrayList<ArrayList<Integer>> Col = new ArrayList<>();

        for (int i = 0; i < grid[0].length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                temp.add(grid[j][i]);
            }
            Col.add(temp);
        }

        for (int i = 0; i < al.size(); i++) {

            ArrayList<Integer> temp = al.get(i);

            for (int j = 0; j < Col.size(); j++) {

                ArrayList<Integer> temp1 = Col.get(j);
                if (temp.equals(temp1)) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void Print2DArray(int[][] grid) {
        for (int[] row : grid) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
        int[][] grid = { { 3, 1, 2, 2 },
                { 1, 4, 4, 5 },
                { 2, 4, 2, 2 },
                { 2, 4, 2, 2 } };

        equalPairsArray epa = new equalPairsArray();

        Print2DArray(grid);
        int c = epa.printRowsAndColumns(grid);

        System.out.println(c);
    }
}
