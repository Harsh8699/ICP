class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0;
        int c=0;
        HashSet<Character>set=new HashSet<>();
        while(b<s.length()){
            if(!set.contains(s.charAt(b))){
                set.add(s.charAt(b));
                c=Math.max(c,b-a+1);
                b++;
            }
            else{
                set.remove(s.charAt(a));
                a++;
            }
        }
        return c;
    }
}