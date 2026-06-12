class Solution {
    public int compress(char[] chars) {
        int w = 0;
        int r = 0;
        while (r < chars.length) {
            char current = chars[r];
            int count = 0;
            while (r < chars.length && chars[r] == current) {
                r++;
                count++;
            }
            chars[w++] = current;
            if (count > 1) {
                String freq = String.valueOf(count);
                for (char c : freq.toCharArray()) {
                    chars[w++] = c;
   }
            }        }
        return w;
    }
}
