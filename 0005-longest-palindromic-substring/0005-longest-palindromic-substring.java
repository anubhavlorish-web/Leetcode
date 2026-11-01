class Solution {
    public String longestPalindrome(String s) {
        String ans ="";

        for(int i =0;i<s.length();i++){
            String n =find(i,i,s);
            if(n.length() > ans.length()){
                ans=n;
            }
            n=find(i,i+1 , s);
            if(n.length() > ans.length()){
                ans =n;
            }
        }
        return ans;
    }

    public String find(int l, int r, String s){
        String ans ="";
        if(l==r){
            ans += s.charAt(l);
            l--;
            r++;
        }
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            ans = s.charAt(l) + ans + s.charAt(r);
            l--;
            r++;
        }
        return ans;
    }
}