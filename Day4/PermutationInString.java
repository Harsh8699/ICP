class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        String sortedS1=new String(arr);
        for(int i=0;i<=n2-n1;i++){
            String sub=s2.substring(i,i+n1);
            char[] arr2=sub.toCharArray();
            Arrays.sort(arr2);
            String sortedSub=new String(arr2);
            if(sortedS1.equals(sortedSub)){
                return true;
            }
        }
        return false;
    }
}