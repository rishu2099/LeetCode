class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int sr = 0, er = n-1;
        int sc = 0, ec = m-1;
        
        while(sr <= er && sc <= ec) {

            for(int i = sc; i <= ec; i++) {
                list.add(matrix[sr][i]);
            }

            for(int j = sr + 1; j <= er; j++) {
                list.add(matrix[j][ec]);
            }

            for(int k = ec - 1; k >= sc; k--) {
                if(sr == er) break;
                list.add(matrix[er][k]);
            }

            for(int l = er - 1; l >= sr + 1; l--) {
                if(sc == ec) break;
                list.add(matrix[l][sc]);
            }

            sr++;
            er--;
            sc++;
            ec--;
        }
        return list;
    }
}