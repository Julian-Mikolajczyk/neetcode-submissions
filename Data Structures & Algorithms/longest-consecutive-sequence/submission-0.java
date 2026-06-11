class Solution {
  public static int longestConsecutive(int[] nums) {
    Set<Integer> s = new HashSet();
    for (int num : nums) {
      s.add(num);
    }
    int longestConsecutive = 0;
    for (Integer i: s){
      if(!s.contains(i-1) ){
        if(longestConsecutive == 0) longestConsecutive = 1;

        int temp = 1;
        while(s.contains(i+temp)){
          temp++;
        }
        if(temp > longestConsecutive) longestConsecutive = temp;
      }

    }
    return longestConsecutive;
  }
}
