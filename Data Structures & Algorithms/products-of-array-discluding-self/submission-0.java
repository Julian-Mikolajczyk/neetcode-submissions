class Solution {
public static int[] productExceptSelf(int[] nums) {
    int[] productsFromLeft = new int[nums.length];
    int[] productsFromRight = new int[nums.length];
    int[] products = new int[nums.length];

    int valueFromLeft = -21;
    int valueFromRight = -21;
    for (int i = 0, j = nums.length-1; i < nums.length; i++, j--) {
      if(valueFromLeft == -21){
        valueFromLeft = nums[i];
        valueFromRight = nums[j];
      }else{
        valueFromLeft = valueFromLeft * nums[i];
        valueFromRight = valueFromRight * nums[j];
      }
      productsFromLeft[i] = valueFromLeft;
      productsFromRight[j] = valueFromRight;
    }
    for (int i = 0; i < nums.length; i++) {
      if(i==0){
        products[i] = productsFromRight[i+1];
      }
      else if(i==nums.length-1){
        products[i] = productsFromLeft[i-1];
      }
      else{
        products[i] = productsFromLeft[i-1]*productsFromRight[i+1];
      }
    }
    return products;
  }
}  
