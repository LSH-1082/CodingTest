class Solution {
    public int solution(int[][] sizes) {
        for(int[] arr : sizes){
            if(arr[0] < arr[1]){
                int tmp = arr[0];
                arr[0] = arr[1];
                arr[1] = tmp;
            }
        }
        int width = 0, height = 0;
        for(int[] arr : sizes){
            if(width < arr[0]) width = arr[0];
            if(height < arr[1]) height = arr[1];
        }
        return width * height;
    }
}