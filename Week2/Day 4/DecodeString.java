class Solution {
    public String decodeString(String s) {
    Stack<Integer> times = new Stack<>();
      Stack<StringBuilder> pieces = new Stack<>();
    StringBuilder chunk = new StringBuilder();
         int freq = 0;
        for(char mark : s.toCharArray()) {
               if(Character.isDigit(mark)) {
                 freq = freq * 10 + (mark - '0');
        } else if(mark == '[') {
                  times.push(freq);
                 pieces.push(chunk);
                freq = 0;
                chunk = new StringBuilder();
            } else if(mark == ']') {
                int turn = times.pop();
                  StringBuilder prev = pieces.pop();
                 while(turn-- > 0) {
                    prev.append(chunk);
                }
                chunk = prev;
         } else {
                chunk.append(mark);
            }
        }
        return chunk.toString();
    }
}
