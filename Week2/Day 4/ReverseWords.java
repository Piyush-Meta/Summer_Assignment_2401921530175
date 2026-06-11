class Solution {
    public String reverseWords(String s) {
        String[] bag = s.split(" ");
        StringBuilder out = new StringBuilder();
        for(int p = 0; p < bag.length; p++) {
            String cur = bag[p];
            StringBuilder flip = new StringBuilder();
            for(int q = cur.length() - 1; q >= 0; q--) {
                flip.append(cur.charAt(q));
            }
            out.append(flip);
            if(p != bag.length - 1) {
                out.append(" ");
            }
        }
        return out.toString();
    }
}
