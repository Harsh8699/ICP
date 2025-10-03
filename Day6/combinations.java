class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] comb=new int[k];
        for(int i=0;i<k;i++) comb[i]=i+1;
        while(true){
            List<Integer> curr=new ArrayList<>();
            for(int x:comb) curr.add(x);
            ans.add(curr);
            int i=k-1;
            while(i>=0 && comb[i]==n-k+1+i) i--;
            if(i<0) break;
            comb[i]++;
            for(int j=i+1;j<k;j++){
                comb[j]=comb[j-1]+1;
            }
        }
        return ans;
    }
}