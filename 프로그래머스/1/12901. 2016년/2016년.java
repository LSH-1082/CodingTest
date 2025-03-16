class Solution {
    public static String solution(int a, int b) {
        String[] strDay = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int firstDay = 5;
        int day = (b % 7) - 1;
        for (int i = 1; i < a; i++) {
            if( i < 8 ) {
                if( i % 2 == 0){
                    int tmp;
                    if( i == 2 ){
                        tmp = 29 % 7;
                    }
                    else {
                        tmp = 30 % 7;
                    }
                    firstDay += tmp;
                }
                else {
                    int tmp = 31 % 7;
                    firstDay += tmp;
                }
            }
            else{
                int tmp;
                if( i % 2 == 0){
                    tmp = 31 % 7;
                }
                else {
                    tmp = 30 % 7;
                }
                firstDay += tmp;
            }
            firstDay %= 7;
        }
        day += firstDay;
        day %= 7;
        if(day == -1) day += 7;
        return strDay[day];
    }
}