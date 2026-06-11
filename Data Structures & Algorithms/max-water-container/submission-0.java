class Solution {
  public static int maxArea(int[] heights) {
    int l = 0, r = heights.length-1, noOfmoves = 0, maxArea = heights[l] > heights[r] ? heights[r]*(heights.length-1) : heights[l]*(heights.length-1);

    while(l<r){
      int tempArea;
      if(heights[l] >= heights[r]){
        r--;
        noOfmoves++;
      }
      else {
        l++;
        noOfmoves++;
      }
      if(heights[l] > heights[r]){
        tempArea = heights[r]*(heights.length-1-noOfmoves);
      }else{
        tempArea = heights[l]*(heights.length-1-noOfmoves);
      }
      if(tempArea > maxArea){
        maxArea = tempArea;
      }
    }
    return maxArea;

  }
}
