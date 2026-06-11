class Solution {
  public int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> numberOfOccurances = new HashMap<>();
    for(Integer i: nums){
      if(numberOfOccurances.containsKey(i)){
        int currentVal = numberOfOccurances.get(i);
        numberOfOccurances.put(i, ++currentVal);
      }else{
        numberOfOccurances.put(i, 1);
      }
    }
    return numberOfOccurances.entrySet().stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();

  }
}
