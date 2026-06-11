class Solution {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '('){
                stack.add(')');
            }else if(c == '['){
                stack.add(']');
            }else if(c == '{'){
                stack.add('}');
            }else{
                if(stack.isEmpty() || c != stack.pop()) return false;
            }
        }
        return stack.isEmpty();
    }
}
