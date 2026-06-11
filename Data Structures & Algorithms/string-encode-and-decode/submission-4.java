class Solution {

  public static String encode(List<String> strs) {

    StringBuilder sb = new StringBuilder();
    for(String s: strs){
      sb.append(s.length()).append("#").append(s);
    }
    return sb.toString();

  }

  public static List<String> decode(String str) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      StringBuilder sb = new StringBuilder();
      while (str.charAt(i) != '#') {
        sb.append(str.charAt(i));
        i++;
      }
      int length = Integer.parseInt(sb.toString());
      i++;
      list.add(str.substring(i, i + length));
      i = i + length-1;
    }
    return list;
  }
}
