class Solution {
    public int characterReplacement(String s, int k) {
        // int n=s.length();
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     int[] f=new int[256];
        //     int max=0;
        //     int left=0;
        //     for(int j=i;j<n;j++){
        //         f[s.charAt(j)]++;
        //         if(f[s.charAt(j)]>max){
        //             max=f[s.charAt(j)];
        //         }
        //         left=j-i+1-max;
        //         if(left>k){
        //             break;
        //         }
        //         ans=Math.max(ans,j-i+1);
        //     }
        // }
        // return ans;

        int start=0,end=0;
        int ans=0;
        int max=0;
        int n=s.length();
        int[] f=new int[256];
        while(end<n){
            char ch=s.charAt(end);
            f[ch-'A']++;
            end++;
            max=Math.max(max,f[ch-'A']);
            while(start<end && end-start-max>k){
                f[s.charAt(start)-'A']--;
                start++;
            }
            ans=(Math.max(ans,end-start));
        }
        return ans;

    }
}