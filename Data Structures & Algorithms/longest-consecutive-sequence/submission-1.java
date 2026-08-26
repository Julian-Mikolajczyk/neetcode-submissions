class Solution {
  public int longestConsecutive(int[] nums) {
    if(nums == null || nums.length == 0) return 0;

    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.merge(num, 1, Integer::sum);
    }
    
    int longest = 0;
    for(Integer i : map.keySet()){
      if(!map.containsKey(i-1)){
        int currentIteration = 1;
        int j = 1;
        while(map.containsKey(i+j)){
          currentIteration++;
          j++;
        }
        longest = Math.max(longest, currentIteration);
      }
    }
    return longest;
  }
}
