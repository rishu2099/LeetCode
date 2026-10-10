class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = 0, ele2 = 0;

        for(int num : nums){
            if(cnt1 == 0 && num != ele2){
                cnt1 = 1;
                ele1 = num; 
            } else if(cnt2 == 0 && num != ele1){
                cnt2 = 1;
                ele2 = num;
            } else if( num == ele1){
                cnt1++;
            } else if(num == ele2){
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int num : nums){
            if(num == ele1) cnt1++;
            if(num == ele2) cnt2++;
        }

        List<Integer> ans = new ArrayList<>();
        int mini = nums.length/ 3+1;
        if(cnt1 >= mini) ans.add(ele1);
        if(cnt2 >= mini && ele1 != ele2) ans.add(ele2);

        return ans;
    }
}