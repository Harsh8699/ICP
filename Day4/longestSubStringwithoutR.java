class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int a=0;
        // int b=0;
        // int c=0;
        // HashSet<Character>set=new HashSet<>();
        // while(b<s.length()){
        //     if(!set.contains(s.charAt(b))){
        //         set.add(s.charAt(b));
        //         c=Math.max(c,b-a+1);
        //         b++;
        //     }
        //     else{
        //         set.remove(s.charAt(a));
        //         a++;
        //     }
        // }
        // return c;


        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> list=new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(!list.contains(s.charAt(j))){
        //             list.add(s.charAt(j));
        //             max=Math.max(list.size(),max);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return max;


        int start=0,end=0;
        int ans=0;
        int f[]=new int[256];
        int n=s.length();
        while(end<n){
            char ch=s.charAt(end);
            f[ch]++;
            end++;
            while(start<end && f[ch]>1){
                char ch2=s.charAt(start);
                f[ch2]--;
                start++;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;
        
    }
}