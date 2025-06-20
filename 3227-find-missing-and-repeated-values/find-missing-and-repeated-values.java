import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        Set<Integer> seen = new HashSet<>();
        int repeated = -1;
        int totalSum = 0;
        for (int[] row : grid) {
            for (int num : row) {
                totalSum += num;
                if (seen.contains(num)) {
                    repeated = num;
                } else {
                    seen.add(num);
                }
            }
        }
        int expectedSum = (size * (size + 1)) / 2;
        int missing = expectedSum - (totalSum - repeated);

        return new int[]{repeated, missing};
    }
}
