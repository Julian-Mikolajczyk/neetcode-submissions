class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int maxAnswer = 0;
        int tempAnswer = 0;
        for(char c : s.toCharArray()){
            if(!queue.contains(c)){
                tempAnswer++;
                queue.add(c);
                maxAnswer = Math.max(tempAnswer,maxAnswer);
            }else{
                while(queue.contains(c)) queue.remove();
                queue.add(c);
                tempAnswer = queue.size();
            }
        }

        return maxAnswer;
    }
}
