class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            ans += value * (int)Math.pow(26, n - i - 1);
        }

        return ans;
    }
}