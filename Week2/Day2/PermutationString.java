class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0 , r = s2.length();
        boolean an = false;
   if(s1.length() > s2.length()) return an;
   int[] s1freq= new int[26];
   int[] ansfreq = new int[26];
   for(char ch: s1.toCharArray()) s1freq[ch -'a']++;
   for(int i=0;i<s1.length();i++){
     ansfreq[s2.charAt(i) -'a']++;
   }
   if(Arrays.equals(s1freq,ansfreq)) return true;
   for(int right=s1.length();right<r;right++){
     ansfreq[s2.charAt(right -s1.length())-'a']--;
     ansfreq[s2.charAt(right )-'a']++;
      if (Arrays.equals(s1freq, ansfreq)) {
               return true;
      }
   }
   return an;
    }
}
