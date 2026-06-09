class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
       if( p.length() > s.length()) return ans;

        int left =0,r =p.length();
        int[] qfre = new int[26];
        int[] wfre = new int[26];

        for(char ch:p.toCharArray())qfre[ch-'a']++;
        for(int i =0; i<p.length();i++){
          wfre[s.charAt(i) -'a']++;
        }
        for(int right=r;right<s.length();right++){
        if(Arrays.equals(qfre, wfre)) ans.add(left);
        wfre[s.charAt(left) - 'a']--;
        left++;
        wfre[s.charAt(right) - 'a']++;
        }
                if(Arrays.equals(qfre, wfre)) ans.add(left);

        return ans;
    }
}
