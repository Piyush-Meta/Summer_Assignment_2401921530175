class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans ="";
        String a1 = strs[0];
        for(int i =0;i<a1.length();i++){
               char check =a1.charAt(i);
               for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || check != strs[j].charAt(i)){
                    return a1.substring(0,i);
                }
               }
        }
        return a1;
    }
}
