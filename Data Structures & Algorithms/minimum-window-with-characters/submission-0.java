class Solution {
public static String minWindow(String s, String t) {
    if(s.length() < t.length()) return "";
    Map<Character, Integer> countWindow = new HashMap<>();
    Map<Character, Integer> countT = new HashMap<>();
    String answer = "";

    for (int i = 0; i < t.length(); i++) {
      countT.merge(t.charAt(i),1, Integer::sum);
      countWindow.merge(t.charAt(i), 0, Integer::sum);
    }
    int l = 0, have = 0, need = countT.size(), resLen = Integer.MAX_VALUE;
    int[] res = {-1,-1};

    for (int r = 0; r < s.length(); r++) {
      char curr = s.charAt(r);
      countWindow.merge(curr, 1, Integer::sum);

      if(countT.containsKey(curr) && countWindow.get(curr).equals(countT.get(curr))) have++;

      while(have == need){
        if((r-l+1) < resLen){
          resLen = r - l + 1;
          res[0] = l;
          res[1] = r;
        }
        char leftChar = s.charAt(l);
        countWindow.put(leftChar,countWindow.get(leftChar)-1);
        if (countT.containsKey(leftChar) && countWindow.get(leftChar) < countT.get(leftChar)) {
          have--;
        }
        l++;
      }

    }
    return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
  }
}
