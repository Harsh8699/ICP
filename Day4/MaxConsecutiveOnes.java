class Solution {
    public int longestOnes(int[] nums, int k) {

        // int n=nums.length;
        // int c=0;
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     c=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]==0){
        //             c++;
        //         }
        //         if(c<=k){
        //             ans=Math.max(ans,j-i+1);
        //         }
        //         if(c>k) break;
        //     }
        // }
        // return ans;


        int start=0,end=0;
        int n=nums.length;
        int c=0;
        int ans=0;
        while(end<n){
            if(nums[end]==0){
                c++;
            }
            end++;
            while(start<end && c>k){
                if(nums[start]==0) c--;
                start++;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;

    }
}