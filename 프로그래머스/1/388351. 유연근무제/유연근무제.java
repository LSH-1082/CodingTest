class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i = 0; i < schedules.length; i++) {
            int preferredAttendanceTime = schedules[i];
            int hour = preferredAttendanceTime / 100;
            int minute = preferredAttendanceTime % 100 + 10;
            
            if(minute > 59) {
                hour++;
                minute %= 60;
            }

            int recognizedAttendanceTime = (hour * 100) + minute;
            int[] attendanceTime = timelogs[i];
            int day = startday;

            int count = 0;
            for(int time : attendanceTime) {
                if(day != 6 && day != 7) {
                    if(time <= recognizedAttendanceTime) count++;
                }
                day = day % 7 + 1;
            }
            if(count == 5) answer++;
        }

        return answer;
    }
}