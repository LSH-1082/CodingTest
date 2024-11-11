class Solution {
    public int solution(int a, int b, int n) {
        int remainder = 0;
        int count = 0;
        while(n >= a){
            remainder = n % a;
            n = (n / a) * b;
            count += n;
            n += remainder;
        }
        return count;
    }
}