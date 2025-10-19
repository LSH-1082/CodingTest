import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Task{
    int num;
    boolean bool;
    public Task(int num, boolean bool){
        this.num = num;
        this.bool = bool;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Task> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0; i < priorities.length; i++) {
            q.offer(new Task(priorities[i], i == location));
            pq.offer(priorities[i]);
        }
        int answer = 1;
        while(!q.isEmpty()){
            Task task = q.poll();
            int max = pq.peek();
            if(task.num < max) q.offer(task);
            else if(!task.bool) {
                answer++;
                pq.poll();
            }
            else break;
        }
        return answer;
    }
}