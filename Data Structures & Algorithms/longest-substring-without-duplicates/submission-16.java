class Solution {
  public static int lengthOfLongestSubstring(String s) {
    int l = 0, r = 1,cl = 0, ml = 0;
    Set<Character> set = new HashSet<>();
    if(s.length() == 1) return 1;
    while(r < s.length()){
      if(set.isEmpty()) {
        set.add(s.charAt(l));
        cl++;
        ml = Math.max(cl, ml);
      }
      if(!set.contains(s.charAt(r))){
        set.add(s.charAt(r));
        cl++;
      }else{
        set = new HashSet<>();
        cl = 0;
        l++;
        r=l;
      }
      r++;
      ml = Math.max(cl, ml);
    }
    return ml;
  }
}
