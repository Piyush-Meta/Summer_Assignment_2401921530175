class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int sl =s.length()-1;
        int tl = t.length()-1;
        if(sl> tl) return false;
        for(int i =tl;i>=0;i--){
            if(s.charAt(sl) == t.charAt(i) && sl == 0) return true;
            if(s.charAt(sl) == t.charAt(i)){
                sl--;
            }
        }
        return false;
    }
}
