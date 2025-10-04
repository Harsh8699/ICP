import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int n1=s.length();
            char[] ch=s.toCharArray();
            boolean ans=false;
            for(int i=k;i<n1;i++){
                if(ch[i-k] !='?' &&ch[i] !='?'&&ch[i-k] !=ch[i]){
                    ans=true;
                    break;
                }
                else if(ch[i-k]=='?' && ch[i]!='?'){
                    ch[i-k]=ch[i];    
                }
                else if(ch[i]=='?' && ch[i-k]!='?'){
                    ch[i]=ch[i-k];
                }
                
            }
            for(int i=n1-1;i>=k;i--){
                if(ch[i-k]=='?' && ch[i]!='?'){
                    ch[i-k]=ch[i];    
                }
                
            }
            int one=0,z=0;
            for(int i=0;i<k;i++){
                if(ch[i]=='0') z++;
                else if(ch[i]=='1') one++;
            }
            if(one>k/2||z>k/2 || ans) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}