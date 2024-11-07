import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        if(arr.length == 1) return new int[]{-1};
        for(int num : arr) {
            min = Math.min(min, num);
        }
        for(int num : arr){
            if(num != min) list.add(num);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}