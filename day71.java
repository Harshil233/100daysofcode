class Solution {
    public int islandPerimeter(int[][] grid) {
        int totalPerimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) 
					totalPerimeter += perimeter(i, j, grid);
            }
        }
        return totalPerimeter;
    }

    public int perimeter(int i, int j, int[][] grid) {
        int sum = 4; 
        if (i - 1 >= 0 && grid[i - 1][j] == 1) 
        {
            sum--;
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 1) 
        {
            sum--;
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 1) 
        {
            sum--;
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) 
        {
            sum--;
        }
        return sum;
    }
}
