class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length()-1;
        int left =0;
while (left < right){
char c = s.charAt(left);
char cr = s.charAt(right);
  if (!Character.isLetterOrDigit(c)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(cr)) {
                right--;
                continue;
            }
             if (Character.toLowerCase(c) != Character.toLowerCase(cr)) {
                return false;
            }
            left++;
            right--;
    }
    return true;
}
}
