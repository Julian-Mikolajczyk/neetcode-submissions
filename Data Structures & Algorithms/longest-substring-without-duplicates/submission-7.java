class Solution {
  public static int lengthOfLongestSubstring(String s) {
    int l = 0, r = 1,currentLength = 0, maxLength = 0;
    Set<Character> set = new HashSet<>();
    if(s.length() == 1) return 1;
    while(r < s.length()){
      if(set.isEmpty()) {
        set.add(s.charAt(l));
        currentLength++;
        maxLength = Math.max(currentLength, maxLength);
      }
      if(!set.contains(s.charAt(r))){
        set.add(s.charAt(r));
        currentLength++;
      }else{
        set.clear();
        currentLength = 0;
        l++;
        r=l;
      }
      r++;
      maxLength = Math.max(currentLength, maxLength);
    }
    return maxLength;
  }
}
