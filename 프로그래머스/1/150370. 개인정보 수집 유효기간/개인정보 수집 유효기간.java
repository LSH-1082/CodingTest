import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<LocalDate> priv_day = new ArrayList<>();
        ArrayList<String> priv_term = new ArrayList<>();
        ArrayList<Integer> answer_list = new ArrayList<>();
        HashMap<String, Integer> term = new HashMap<>();

        for(String te : terms){
            String[] tmp = te.split(" ");
            term.put(tmp[0], Integer.parseInt(tmp[1]));
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate today_date = LocalDate.parse(today, formatter);
        for(String priv : privacies){
            String[] tmp = priv.split(" ");
            LocalDate date = LocalDate.parse(tmp[0], formatter);
            priv_day.add(date);
            priv_term.add(tmp[1]);
        }

        for(int i = 0; i < priv_day.size(); i++){
            priv_day.set(i, priv_day.get(i).plusMonths(term.get(priv_term.get(i))));
            if(priv_day.get(i).isBefore(today_date) || priv_day.get(i).isEqual(today_date)){
                answer_list.add(i + 1);
            }
        }
        int[] answer = new int[answer_list.size()];
        for (int i = 0; i < answer_list.size(); i++) {
            answer[i] = answer_list.get(i);
        }
        return answer;
    }
}
