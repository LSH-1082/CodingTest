import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int onBridgeWeight = 0;
        int time = 0;

        for(int truck : truck_weights){
            while(true){
                time++;
                if (queue.size() == bridge_length) {
                    onBridgeWeight -= queue.poll();
                }
                if(onBridgeWeight + truck <= weight){
                    onBridgeWeight += truck;
                    queue.offer(truck);
                    break;
                }
                else{
                    queue.offer(0);
                }
            }
        }
        time += bridge_length;
        return time;
    }
}