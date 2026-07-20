class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        while (k-- > 0) {
            int[][] arr = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (j < n - 1) {
                        arr[i][j + 1] = grid[i][j];
                    } else if (i < m - 1) {
                        arr[i + 1][0] = grid[i][j];
                    } else {
                        arr[0][0] = grid[i][j];
                    }
                }
            }

            grid = arr;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}