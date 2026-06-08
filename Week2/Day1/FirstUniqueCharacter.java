class pair{
    int first;
    int second;
      pair(int first , int second){
     this.first = first;
      this.second = second;
}
}
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , pair> map = new HashMap<>();
        for(int i = 0 ;i < s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
            map.get(ch).first++;
            }
            else{
                map.put(ch, new pair(1,i));
            }
        }
        int result = Integer.MAX_VALUE ;
        for( pair entry : map.values()){
            if(entry.first ==1)
            result= Math.min(result,entry.second);   
                }
   return result == Integer.MAX_VALUE ? -1 : result ;
    }
}
