class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for( String s : strs){
            char[] a = s.toCharArray();
              Arrays.sort(a);
              String key = new String(a);
              if(!map.containsKey(key))
              {
                map.put(key,new ArrayList());
              }
                map.get(key).add(s);
            }
            List<List<String>> ans = new ArrayList<>();
            for(String entry : map.keySet()){
                ans.add(map.get(entry));
            }
return ans;
        }
    }
