class Solution {
    public int trap(int[] height) {
        int n = height.length;

        //Left Max Array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);   
        }

        //Right Max Array
        int Rightmax[] = new int[n];
        Rightmax[n-1] = height[n-1];

        for(int i = n-2; i >= 0; i--) {
            Rightmax[i] = Math.max(height[i] , Rightmax[i+1]);
        }

        //Water Level
        int waterlvl = 0;
        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            waterlvl = Math.min(leftmax[i] , Rightmax[i]);

            trappedWater += (waterlvl - height[i]);
        }
        return trappedWater;
    }
}