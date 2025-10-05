class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int pre2=0;
        int pre1=0;
        for(int x:nums){
        int cur=Math.max(pre1,pre2+x);
        pre2=pre1;
        pre1=cur;
        }
        return pre1;
    }
}