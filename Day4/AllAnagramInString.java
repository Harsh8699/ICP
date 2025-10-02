class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()) return ans;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int k=p.length();
        for(int i=0;i<k;i++){
            freq1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            freq2[s.charAt(i)-'a']++;
            if(i<k-1) continue;
            if(Arrays.equals(freq1,freq2)) ans.add(i-k+1);
            freq2[s.charAt(i-k+1)-'a']--;
        }
        return ans;
    }
}