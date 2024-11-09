import java.util.Stack;

class Solution {
    public int solution(int n) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int result = n;
        while(result >= 3){
            stack.push(result % 3);
            result /= 3;
        }
        stack.push(result % 3);

        int i = 0;
        while(!stack.isEmpty()){
            answer += (int) (stack.pop() * Math.pow(3, i));
            i++;
        }
        return answer;
    }
}