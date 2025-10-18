import java.util.Stack;

class Solution {
    boolean solution(String s) {
        if(s.charAt(0) != '(') return false;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(!stack.isEmpty() && s.charAt(i) == ')') stack.pop();
            else stack.push(s.charAt(i));
        }
        if(!stack.isEmpty()) return false;
        else return true;
    }
}