import java.util.ArrayList;
import java.util.List;

public class LC0118_PascalsTriangle {
     public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> currentRow = new ArrayList<>();

            long ans = 1;

            currentRow.add(1);

            for (int col = 1; col <= row; col++) {

                ans = ans * (row - col + 1);
                ans = ans / col;

                currentRow.add((int) ans);
            }

            result.add(currentRow);
        }

        return result;
    }
}
