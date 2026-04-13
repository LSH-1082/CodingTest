import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
        private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] list = new ArrayList[vertex + 1];

        for(int i = 1; i <= vertex; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int parentVertex = Integer.parseInt(st.nextToken());
            int childVertex = Integer.parseInt(st.nextToken());

            list[parentVertex].add(childVertex);
            list[childVertex].add(parentVertex);
        }

        printDfs(list, startVertex);
        bw.newLine();
        printBfs(list, startVertex);
        bw.flush();
    }

    public static void printDfs(ArrayList<Integer>[] list, int startVertex) throws IOException {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean[] isVisited = new boolean[list.length];

        st.add(startVertex);

        while(!st.isEmpty()) {
            int vertex = st.pop();
            if(isVisited[vertex]) {
                continue;
            }
            isVisited[vertex] = true;
            sb.append(vertex).append(" ");

            ArrayList<Integer> tmpList = new ArrayList<>(list[vertex]);
            tmpList.sort(Comparator.naturalOrder());

            for(int i = tmpList.size() - 1; i >= 0; i--) {
                st.push(tmpList.get(i));
            }
        }
        bw.write(sb.toString());
    }

    public static void printBfs(ArrayList<Integer>[] list, int startVertex) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        boolean[] isVisited = new boolean[list.length];

        q.add(startVertex);

        while(!q.isEmpty()) {
            int vertex = q.poll();
            if(isVisited[vertex]) {
                continue;
            }
            isVisited[vertex] = true;
            sb.append(vertex).append(" ");

            ArrayList<Integer> tmpList = new ArrayList<>(list[vertex]);
            tmpList.sort(Comparator.naturalOrder());

            for(int i = 0; i < tmpList.size(); i++) {
                q.add(tmpList.get(i));
            }
        }
        bw.write(sb.toString());
    }
}