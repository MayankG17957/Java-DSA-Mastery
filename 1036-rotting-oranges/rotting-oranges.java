
class Solution {

    class pair {
        int row;
        int col;
        int time;

        pair(int _row, int _col, int _tm) {
            this.row = _row;
            this.col = _col;
            this.time = _tm;
        }
    }

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<pair> qu = new LinkedList<>();

        int vis[][] = new int[n][m];

        int cntFresh = 0;

        // Step 1: Initialize queue and count fresh oranges
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(grid[i][j] == 2) {
                    qu.add(new pair(i, j, 0));
                    vis[i][j] = 2;
                }
                else {
                    vis[i][j] = 0;
                }

                if(grid[i][j] == 1) {
                    cntFresh++;
                }
            }
        }

        // Four directions: up, right, down, left
        int delRow[] = {-1, 0, 1, 0};
        int delCol[] = {0, 1, 0, -1};

        int time = 0;

        // Step 2: BFS
        while(!qu.isEmpty()) {

            pair p = qu.remove();

            int r = p.row;
            int c = p.col;
            int t = p.time;

            time = Math.max(time, t);

            for(int i = 0; i < 4; i++) {

                int nr = r + delRow[i];
                int nc = c + delCol[i];

                if(nr >= 0 && nr < n &&
                   nc >= 0 && nc < m &&
                   grid[nr][nc] == 1 &&
                   vis[nr][nc] == 0) {

                    vis[nr][nc] = 2;

                    cntFresh--;

                    qu.add(new pair(nr, nc, t + 1));
                }
            }
        }

        // Step 3: Check remaining fresh oranges
        if(cntFresh != 0) {
            return -1;
        }

        return time;
    }
}
