class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] result = new int[R * C][2];
        int cnt = 1;
        
        int i = r0;
        int j = c0;
        result[0][0] = i;
        result[0][1] = j;
        
        int step = 1;
        int ind = 0;
        
        int[][] delta = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        while (cnt != R * C) {
            int temp = step;

            while (temp != 0) {
                i = i + delta[ind][0];
                j = j + delta[ind][1];
                
                if (inBound(i, j, R, C)) {
                    result[cnt][0] = i;
                    result[cnt][1] = j;
                    cnt++;
                }
                
                temp--;
            }

            ind++;
            if (ind % 2 == 0) {
                step++;
            }
            if (ind == 4) {
                ind = 0;
            }
        }
        
        return result;
    }
    
    private boolean inBound(int r, int c, int R, int C) {
        return r >= 0 && r < R && c >= 0 && c < C;
    }
}