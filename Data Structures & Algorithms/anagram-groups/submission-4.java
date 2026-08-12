class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for(String s : strs){
      int[] temp = new int[26];
      for(int i = 0; i<s.length(); i++){
        temp[s.charAt(i) - 'a']++;
      }
      String x = Arrays.toString(temp);
      if(!map.containsKey(x)){
        List<String> list = new ArrayList();
        list.add(s);
        map.put(x, list);
      }else{
        List<String> list = map.get(x);
        list.add(s);
      }
    }
    return new ArrayList<>(map.values());
  }
}
