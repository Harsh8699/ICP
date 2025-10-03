class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(candidates);
        int n=candidates.length;
        int total=(int)Math.pow(2,n);
        for(int mask=0;mask<total;mask++){
            List<Integer> subset=new ArrayList<>();
            int sum=0;
            int temp=mask;
            int idx=0;
            while(temp>0){
                if(temp%2==1){
                    sum+=candidates[idx];
                    subset.add(candidates[idx]);
                }
                idx++;
                temp/=2;
            }
            if(sum==target){
                Collections.sort(subset);
                set.add(subset);
            }
        }
        return new ArrayList<>(set);
    }
}