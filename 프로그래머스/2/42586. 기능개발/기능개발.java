import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> pQueue = new LinkedList<>();
        Queue<Integer> sQueue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : progresses){
            pQueue.add(n);
        }
        for(int n : speeds){
            sQueue.add(n);
        }

        while(!pQueue.isEmpty()){
            int day =  (int) Math.ceil((float)(100 - pQueue.poll()) / sQueue.poll());
            int count = 1;
            while(!pQueue.isEmpty() && pQueue.peek() + (sQueue.peek() * day) >= 100){
                    pQueue.poll();
                    sQueue.poll();
                    count++;
            }
            list.add(count);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
