/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/2
 * @Description
 */
public class L_200 {

    /**
     * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
     *
     * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
     *
     * 此外，你可以假设该网格的四条边均被水包围。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/number-of-islands
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        int row_length = grid.length;
        int col_length = grid[0].length;
        int ans = 0;
        for (int r = 0; r < row_length; r++) {
            for (int c = 0; c < col_length; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c, row_length, col_length);
                    ans += 1;
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int r, int c, int row_length, int col_length) {
        if ( !checkOutException(row_length, col_length, r ,c)) {
            return;
        }
        if (grid[r][c] != '1')
        {
            return;
        }
        grid[r][c] = '2';
        dfs(grid, r+1, c, row_length, col_length);
        dfs(grid, r-1, c, row_length, col_length);
        dfs(grid, r, c+1, row_length, col_length);
        dfs(grid, r, c-1, row_length, col_length);
    }

    private boolean checkOutException(int row_length, int col_length, int r, int c) {
        return r >= 0 && r < row_length && c >= 0 && c < col_length;
    }
}
