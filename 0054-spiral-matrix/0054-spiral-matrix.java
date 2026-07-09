class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int sr = 0, er = n - 1;
        int sc = 0, ec = m - 1;

        while (sr <= er && sc <= ec) {

            for (int i = sc; i <= ec; i++) {
                list.add(matrix[sr][i]);
            }

            for (int i = sr + 1; i <= er; i++) {
                list.add(matrix[i][ec]);
            }

            if (sr < er) {
                for (int i = ec - 1; i >= sc; i--) {
                    list.add(matrix[er][i]);
                }
            }

            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) {
                    list.add(matrix[i][sc]);
                }
            }

            sr++;
            er--;
            sc++;
            ec--;
        }

        return list;
    }
}