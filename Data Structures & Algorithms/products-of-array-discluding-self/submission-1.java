class Solution {
  public int[] productExceptSelf(int[] nums) {
    int length = nums.length;
    int[] answer = new int[length];
    int[] prefix = new int[length];
    int[] postfix = new int[length];

    prefix[0] = 1;
    postfix[length-1] = 1;
    
    for(int i = 1; i < length; i ++){
      prefix[i] = nums[i-1] * prefix[i-1];
    }
    for(int i = length-2; i>=0; i--){
      postfix[i] = nums[i+1] * postfix[i+1];
    }
    for(int i = 0; i < length; i ++){
      answer[i] = postfix[i] * prefix[i];
    }
    return answer;

  }
}  
