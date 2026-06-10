class Solution {
    public boolean repeatedSubstringPattern(String s) {
       int len = s.length();
       for(int i = len/2 ;i>=1;i--){
        if(len%i == 0){
            int l = len / i;
            StringBuilder sd  = new StringBuilder();
            String demo = s.substring(0,i);
         for(int j =0;j<l;j++){
            sd.append(demo);
         } 
         if(sd.toString().equals(s)) return true;
        }
       }
       return false;
    }
}
